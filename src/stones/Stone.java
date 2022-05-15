package stones;

import board.Color;

public class Stone {
    
    boolean free;
    Color color;

    public Stone() {
        this.free = true;
        this.color = Color.NOCOLOR;
    }

    public Stone(Color color) {
        this.free = false;
        this.color = color;
    }

    public String toString() {
        if(this.color.equals(Color.BLACK)) {
            return " B ";
        } else if(this.color.equals(Color.WHITE)) {
            return " W ";
        } else {
            return " _ ";
        }
    }

}
