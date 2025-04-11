package LLD_TIC_TAC_TOE.models;
import java.util.ArrayList;
import java.util.List;

class Pair {
    int row;
    int col;

    public Pair(int row, int col) {
        this.row = row;
        this.col = col;
    }
}

public class Board {
    int size;
    public PlayingPiece board[][];

    public Board(int size) {
        this.size = size;
        board = new PlayingPiece[size][size];
    }

    public boolean addPiece(int row, int col, PlayingPiece piece) {
        if (board[row][col] == null) {
            board[row][col] = piece;
            return true;
        }
        return false;
    }

    public List<Pair> getFreeCells() {
        List<Pair> freeCells = new ArrayList<>();
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j] == null){
                    freeCells.add(new Pair(i,j));
                }
            }
        }
        return freeCells;
    }

    public void printBoard() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (board[i][j] == null) {
                    System.out.print(" - ");
                } else {
                    System.out.print(" " + board[i][j].pieceType + " ");
                }
            }
            System.out.println();
        }
    }
}
