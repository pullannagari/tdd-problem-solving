package com.shoppingcart.testdrivendev;

import java.util.HashSet;

public class CountUniqueChars {

    // need to generate the combination of substrings


    //brute-force approach would be to have a double loop to go over the substrings
    //then for each of the substring, calculate the count

    HashSet<String> uniqueSubs = new HashSet<>();

    public int uniqueLetterString(String input) {
        int sum = 0;
        for(int i=0; i< input.length(); i++){
            for(int j=i; j<input.length(); j++){
                System.out.println(input.substring(i, j+1));
                uniqueSubs.add(input.substring(i, j+1));
            }
        }
        for(String sub: uniqueSubs){
            sum += calculateCount(sub);
        }
        return sum;
    }


    private int calculateCount(String substring) {
        HashSet<Character> uniques = new HashSet<>();
        for(Character c:substring.toCharArray())
            uniques.add(c);
        return uniques.size();
    }
}
