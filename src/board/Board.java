package board;

import java.util.ArrayList;

import stones.Stone;

public class Board {
   
    public int fieldNumber;
    public Stone[] field;
    public Color turn = Color.BLACK;
    public int turnCounter = 1;

    public Board(int number) {

        this.fieldNumber = number;
        this.field = new Stone[number*number];

        int n = number * number;
        for(int i=0; i < n; i++) {
            this.field[i] = new Stone();
        }

    }


    public void doMove() {

        // Move -> 1) pass, 2) move

        // rule 1: remove captured stones
        this.liberty();
        // rule 2: never repeat a previous position of stones

        // turn
        this.turnCounter++;
    }

    public void liberty() {
        // check board for stones that are captured

        // now remove the captured stones

    }

    public void setToken(Stone stone, int pos) {
        this.field[pos] = stone;
    }



    public void endGame() {
        // resignation
    }

    public void endAnalysis() {

        this.territory();
        this.komi();
    }

    public void territory() {}
    public void komi() {} // points added to the score of the player with white stones as compensation for playing second




    public String toString() {
        StringBuilder str = new StringBuilder();
        int n = this.fieldNumber * this.fieldNumber;
        int fieldNumber = this.fieldNumber;

        System.out.println("Board Representation");
        System.out.println();

        for(int i=0; i < n; i++) {
            System.out.print(this.field[i].toString());
            if(i != 0 && ((i+1) % fieldNumber == 0)) {
                System.out.println();
            }
        }
        return str.toString();
    }

}
