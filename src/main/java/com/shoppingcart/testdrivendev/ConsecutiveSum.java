package com.shoppingcart.testdrivendev;

public class ConsecutiveSum {
    // consecutive sum implies that the numbers in order and less than n
    // if n is less than or equal to 2 then return 1
    // the sum should be between n/2 + 1
    // 1 2 3 4 5 6 7 8
    //
    // algorithm:
    // starting from n/2+1 to 0
    // check if the sum of n/2+1 and n/2 is > n then decrement and compare n/2, n/2 -1 and so on
    public int getConseciveSumCount(int n) {
        if(n <= 2){
            return 1;
        }
        int count = 1;
        int tempSum = 0;
        int startTrim = 1;
        for(int i=1; i <= n/2+1 ; i++){
            tempSum += i;
            while(tempSum > n){
                tempSum -= startTrim;
                startTrim ++;
            }
            if(tempSum == n){
                count++;
            }
        }
        return count;
    }
}
