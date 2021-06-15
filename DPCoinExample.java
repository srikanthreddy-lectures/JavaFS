package challengs1;

import java.util.Arrays;

public class DPCoinExample {
    public static void main(String[] args) {
        int target= 18;
        int[] arr={7,5,1};
        int[] dp = new int[target+1];
        Arrays.fill(dp,-1);
       // System.out.println(Arrays.toString(dp));
        System.out.println(minCoins(target,arr,dp));
        System.out.println(Arrays.toString(dp));
    }
    static  int minCoins(int target, int[] arr,int[] dp){
        int result=Integer.MAX_VALUE;
        if(target==0)return 0;
        for (int i = 0; i <arr.length ; i++) {
            int solOfSubproblem=0;
            if(target-arr[i] >= 0){
                if(dp[target-arr[i]] != -1){
                    solOfSubproblem = dp[target-arr[i]];
                }
                else {
                    solOfSubproblem = minCoins(target-arr[i], arr, dp);
                }

                if(solOfSubproblem + 1 < result)
                {
                    result = solOfSubproblem+1;
                }
                //result = Math.min(result,solOfSubproblem);
            }
        }
        return dp[target]=result;
    }
}
