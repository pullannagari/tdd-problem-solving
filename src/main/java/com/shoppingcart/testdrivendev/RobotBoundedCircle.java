package com.shoppingcart.testdrivendev;

public class RobotBoundedCircle {
    //given instructions to be executed in order
    // find if the instructions executed repeatedly results in a circle
    public boolean findIfBoundedInCircle(String input) {
        int x = 0, y = 0;
        char direction = 'N';
        for(Character c: input.toCharArray()){
            if(c == 'G'){
                if(direction == 'N'){
                    y += 1;
                }else if(direction == 'E'){
                    x += 1;
                }else if(direction == 'W'){
                    x -= 1;
                }else if(direction == 'S'){
                    y -= 1;
                }
            }else if(c == 'L'){
                if(direction == 'N'){
                    direction = 'W';
                }else if(direction == 'W'){
                    direction = 'S';
                }else if(direction == 'S'){
                    direction = 'E';
                }else if(direction == 'E'){
                    direction = 'N';
                }
            }else if(c == 'R'){
                if(direction == 'N'){
                    direction = 'E';
                }else if(direction == 'E'){
                    direction = 'S';
                }else if(direction == 'S'){
                    direction = 'W';
                }else if(direction == 'W'){
                    direction = 'N';
                }
            }
        }
        System.out.println(direction != 'N');
        if(x==0 && y ==0) return true;
        if(direction == 'N') return false;
        return true;
    }
}
