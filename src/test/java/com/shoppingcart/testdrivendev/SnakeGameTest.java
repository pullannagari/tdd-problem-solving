package com.shoppingcart.testdrivendev;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SnakeGameTest {
    // Question 2
    // write a program to simulate the snake game
    // you are given a grid of size 20x20
    // user performs a move operation in any of the direction
    // the initial size of the snake is 3
    // the size of the snake increases every 5th move
    // game is over when the snake hits wall or runs into itself

    @Test
    @DisplayName("test if the snake make the right moves")
    public void testSnakeGame(){
        SnakeGame snakeGame = new SnakeGame(3);
        snakeGame.move(SnakeGame.Direction.D);
        snakeGame.move(SnakeGame.Direction.R);
        snakeGame.move(SnakeGame.Direction.R);
        snakeGame.move(SnakeGame.Direction.L);
        Assertions.assertTrue(snakeGame.isGameOver(), "snake game has ended");
    }

    @Test
    @DisplayName("test if the snake make the right moves")
    public void testSnakeGoodGame(){
        SnakeGame snakeGame = new SnakeGame(3);
        snakeGame.move(SnakeGame.Direction.D);
        snakeGame.move(SnakeGame.Direction.R);
        snakeGame.move(SnakeGame.Direction.R);
        Assertions.assertFalse(snakeGame.isGameOver(), "snake game has ended");
    }

    @Test
    @DisplayName("test if the snake make the right moves")
    public void testSnakeGameFiveMoves(){
        SnakeGame snakeGame = new SnakeGame(3);
        snakeGame.move(SnakeGame.Direction.D);
        snakeGame.move(SnakeGame.Direction.R);
        snakeGame.move(SnakeGame.Direction.R);
        snakeGame.move(SnakeGame.Direction.D);
        snakeGame.move(SnakeGame.Direction.R);
        Assertions.assertFalse(snakeGame.isGameOver(), "snake game has ended");
        SnakeGame.Point p = new SnakeGame.Point(3,4);
        Assertions.assertEquals(snakeGame.snake.getLast(), p);
    }
}
