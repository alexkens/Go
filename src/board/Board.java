package board;

import java.util.ArrayList;

import stones.Stones;

public class Board {
   
    Stones[] field;
    Color turn = Color.BLACK;
    int turnCounter = 1;

    public Board(int number) {

        this.field = new Stones[number*number];

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



    public void endGame() {
        // resignation
    }

    public void endAnalysis() {

        this.territory();
        this.komi();
    }

    public void territory() {}
    public void komi() {} // points added to the score of the player with white stones as compensation for playing second

}
