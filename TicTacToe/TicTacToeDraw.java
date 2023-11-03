package CasualGame.TicTacToe;

public class TicTacToeDraw {

    private final int BOARDWIDTH;
    private final int BOARDHEIGHT;

    public TicTacToeDraw (){
        BOARDWIDTH = 300;
        BOARDHEIGHT = BOARDWIDTH;
    }

    public  TicTacToeDraw (int boardWidth, int boardHeight){
        this.BOARDWIDTH = boardWidth;
        this.BOARDHEIGHT = boardHeight;
    }

    public int getBOARDWIDTH() {
        return BOARDWIDTH;
    }

    public int getBOARDHEIGHT() {
        return BOARDHEIGHT;
    }
}
