package com.Backtracking;

public class MazeAllPathsBacktracking {
    public static void main(String[] args) {
        boolean[][] board = {
                {true , true , true},
                {true , true , true},
                {true , true , true}
        };
        mazepath("" , board ,0 , 0);
    }
    static void mazepath(String p, boolean[][] maze, int r, int c ){
        if (r== maze.length-1 && c==maze[0].length-1){
            System.out.println(p);
            return;
        }
        if (!maze[r][c]){
            return;
        }

        maze[r][c] = false;
        if (r < maze.length-1){
            mazepath(p+'D', maze, r+1,c);
        }if (c< maze[0].length-1){
            mazepath(p+'R', maze , r,c+1);
        }if (c>0){
            mazepath(p+'L',maze , r,c-1);
        }if (r>0){
            mazepath(p+'U',maze , r-1,c);
        }
        maze[r][c] = true;

    }

}
