package _6_Backtracing;

import java.util.ArrayList;
import java.util.List;

public class RatInMaze {
    public void findDir() {
        int[][] maze = { { 1, 0, 0, 0 },
                { 1, 1, 0, 1 },
                { 1, 1, 0, 0 },
                { 0, 1, 1, 1 } };
        List<String> result = new ArrayList<>();
        int len = maze.length;
        int[] di = {1, 0, 0 , -1};
        int[] dj = {0, -1, 1, 0};
        if(maze[0][0] == 1 ) backtrack(0,0,maze, len,result,"", new int[len][len], di, dj);
        result.forEach(i -> System.out.println(i));
    }

    void backtrack(int i, int j, int[][] maze, int n,List<String> result, String move, int[][] visited, int[]di, int[] dj) {
        if(i == n-1 && j == n-1) {
            result.add(move);
            return;
        }

        String dir = "DLRU";

        for(int z = 0; z < di.length; z++) {
            int nexti = i + di[z];
            int nextj = j + dj[z];
            if(nexti < n && nexti >= 0 && nextj < n && nextj >= 0 && visited[nexti][nextj] == 0 && maze[nexti][nextj] == 1) {
                visited[nexti][nextj] = 1;
                backtrack(nexti, nextj, maze, n, result, move+dir.charAt(z), visited,di,dj);
                visited[nexti][nextj] = 0;
            }
        }



//        //downward
//        if(i+1 < n && visited[i+1][j] != 1 && maze[i+1][j] == 1) {
//            visited[i][j] = 1;
//            backtrack(i+1, j, maze, n, result, move+"D", visited);
//            visited[i][j] = 0;
//        }
//        // Left
//        if(j-1 >= 0  && visited[i][j-1] != 1 && maze[i][j-1] == 1) {
//            visited[i][j] = 1;
//            backtrack(i, j-1, maze, n, result, move+"L", visited);
//            visited[i][j] = 0;
//        }
//
//        //Right
//        if(j+1 < n && visited[i][j+1] != 1 && maze[i][j+1] == 1) {
//            visited[i][j] = 1;
//            backtrack(i, j+1, maze, n, result, move+"R", visited);
//            visited[i][j] = 0;
//        }
//
//        // UP
//        if(i-1 >= 0 && visited[i-1][j] != 1 && maze[i-1][j] == 1) {
//            visited[i][j] = 1;
//            backtrack(i-1, j, maze, n, result, move+"U", visited);
//            visited[i][j] = 0;
//        }
    }
}
