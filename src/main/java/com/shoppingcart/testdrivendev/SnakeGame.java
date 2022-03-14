package com.shoppingcart.testdrivendev;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Objects;

public class SnakeGame {

    static class Point{
        public int x;
        public int y;
        public Point(int x, int y){
            this.x = x;
            this.y = y;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Point point = (Point) o;
            return x == point.x && y == point.y;
        }

        @Override
        public int hashCode() {
            return Objects.hash(x, y);
        }
    }

    private boolean gameOver;
    private int currMoves;
    private int[][] board = new int[20][20];
    LinkedList<Point> snake = new LinkedList<>();
    enum Direction {
        L,
        U,
        D,
        R
    }
    public SnakeGame(int initialLength){
        for(int i =0; i< initialLength; i++){
            board[0][i] = 1;
            snake.add(new Point(0, i));
        }
    }

    // start at (0,0) as tail and (0,2) as the head,
    // also populate the presence. have the tail represented as 1 and so on till head as 3
    // when a move is made current tail will be set to 0 and then the next cell with 2 is set as 2-1, and so on till the head is reached,
    // then the new head will be set as 3 in the new cell determined by direction
    // when a move is called, calculate the new head and check if the cell has a value
    // if the cell has the value, then return
    //
    public void move(Direction direction) {
        if(!isGameOver()){
            // check if the direction is causing a game over
            // new cell has a value > 0, new cell is out of bounds are the conditions
            int x = this.snake.getLast().x, y = this.snake.getLast().y;
            if(direction.equals(Direction.D)){
                y = this.snake.getLast().y + 1;
            }else if(direction.equals(Direction.U)){
                y = this.snake.getLast().y - 1;
            }else if(direction.equals(Direction.R)){
                x = this.snake.getLast().x + 1;
            }else if(direction.equals(Direction.L)) {
                x = this.snake.getLast().x - 1;
            }

            if(x > 19 || x < 0 || y > 19 || y < 0){
                this.gameOver = true;
                return;
            }
            if(this.board[x][y] != 0){
                this.gameOver = true;
                return;
            }
            // this is the 5th move, increase the length of the snake

            this.snake.add(new Point(x, y));
            this.board[x][y] = 1;
            if(this.currMoves == 4){
                this.currMoves = 0;
            }else{
                this.board[this.snake.getFirst().x][this.snake.getFirst().y] = 0;
                this.currMoves++;
            }
        }
    }

    public boolean isGameOver() {
        return this.gameOver;
    }
}
