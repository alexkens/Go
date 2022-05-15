package stones;

import board.Color;

public class Stones {
    
    boolean free;
    Color color;

    public Stones() {
        this.free = true;
    }

    public Stones(Color color) {
        this.color = color;
    }

}
