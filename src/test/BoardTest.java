package test;

import board.Color;

import org.junit.Test;

import board.Board;
import stones.Stone;

public class BoardTest {

    @Test
    public void test1() {
        Board board = new Board(9);
        System.out.println(board.toString());

        board.setToken(new Stone(Color.BLACK), 0);
        System.out.println(board.toString());
    }
    
}
