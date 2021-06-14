package challengs1;

import java.util.Arrays;

public class FloodFill {
    public static void main(String[] args) {
        int[][] image = {{1,1,1},{1,1,0},{1,0,1}};
        System.out.println(Arrays.deepToString(fillColor(image,1,1,2)));
    }
    public static int[][] fillColor(int[][] image, int sr, int sc, int newColor){
        //logic
        int oldColor = image[sr][sc];
        dfs(image,sr,sc,oldColor,newColor);
        return image;
    }

    private static void dfs(int[][] image, int sr, int sc,int oldColor, int newColor){
        // four direction
        int rowLength=image.length;
        int colLength=image[0].length;
        if(sr<0 || sr >= rowLength || sc < 0 || sc >= colLength || image[sr][sc]!=oldColor){
            return;
        }
        image[sr][sc]=newColor;
        dfs(image,sr+1,sc,oldColor,newColor);
        dfs(image,sr-1,sc,oldColor,newColor);
        dfs(image,sr,sc+1,oldColor,newColor);
        dfs(image,sr,sc-1,oldColor,newColor);
    }
}
