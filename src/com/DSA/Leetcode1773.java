package com.DSA;
import java.util.ArrayList;
import java.util.Arrays;
import  java.util.List;
public class Leetcode1773 {
    public static void main(String[] args) {
        List<List<String>> items = new ArrayList<>();
              items.add(Arrays.asList("phone","blue","pixel"));
              items.add(Arrays.asList("computer","silver","lenovo"));
              items.add(Arrays.asList("phone","gold","iphone"));

        String  ruleKey = "type", ruleValue = "phone";

        System.out.println(countMatches(items , ruleKey, ruleValue));

    }
    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        int col;
        if (ruleKey.equals("type")){
            col = 0;
        }
        else if (ruleKey.equals("color")){
            col = 1;
        }
       else {
            col = 2;
        }

        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).get(col).equals(ruleValue)){
                count+=1;
            }
        }

        return count;
    }
}
