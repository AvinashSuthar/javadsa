package com.Backtracking;

import java.util.ArrayList;

public class Maze {
    public static void main(String[] args) {
//        System.out.println(maze(3,3));]
//        path( "" , 3,3);
        System.out.println(pathRetDia("" , 3,3));
    }


    static int maze (int r, int c){
        if (r==1|| c==1){
            return  1;
        }
        int left = maze(r-1 , c);
        int right = maze(r, c-1);
        int ans = left + right;

        return ans;
    }

    static void path(String p , int r , int c) {
        if (r==1 && c==1){
            System.out.println(p);
            return;
        }
        if (r>1){
            path(p+'D' , r-1,c);
        }if (c>1){
            path(p+'R' , r,c-1);
        }

    }



    static ArrayList<String> pathRet(String p , int c, int r){
        if (c==1 && r==1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if (c>1){
            list.addAll(pathRet(p+'R' , c-1 , r));
        } if (r>1){
            list.addAll(pathRet(p+'D' , c , r-1));
        }

        return list;
    }
    static ArrayList<String> pathRetDia(String p , int c, int r){
        if (c==1 && r==1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if (c>1){
            list.addAll(pathRetDia(p+'H' , c-1 , r));
        }if (c>1 && r>1){
            list.addAll(pathRetDia(p+'D' , c-1 , r-1));
        } if (r>1){
            list.addAll(pathRetDia(p+'V' , c , r-1));
        }

        return list;
    }

}
