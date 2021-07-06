package challengs1;

import java.util.Arrays;
import java.util.List;

/*
[5,8,0,9]  ---> [1,1,0,0]
 */
public class CountSmallRight {
    class  TreeNode{
        int value;
        int count;
        TreeNode left;
        TreeNode right;

        TreeNode(int x, int y){
            value = x;
            count = y;
        }
    }

    private int createNode(TreeNode node,int value){
        node.count++;
        int result=0;
        if(value >= node.value){
            if(value>node.value) result++;
            if(node.left!=null) result =result + node.left.count;
            if(node.right!=null){
                result = result + createNode(node.right,value);
            }else {
                node.right = new TreeNode(value,1);
            }
        }
        else {
            if(node.left == null){
                node.left = new TreeNode(value,1);
            }
            else {
                result = result + createNode(node.left,value);
            }
        }
        return result;
    }

    public List<Integer> solver(int[] nums){
        //logic
        int n = nums.length;
        Integer[] res = new Integer[n];
        TreeNode root =new TreeNode(nums[n-1],1);
        res[nums.length -1]=0;
        for (int i = nums.length -2 ; i >=0 ; i--) {
            res[i]=createNode(root,nums[i]);
        }
        return Arrays.asList(res);
    }

    public static void main(String[] args) {
        int[] nums = {5,8,0,9};
        CountSmallRight csr = new CountSmallRight();
        List<Integer> result = csr.solver(nums);
        System.out.println(result);
    }
}
