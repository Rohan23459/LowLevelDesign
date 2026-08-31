package TICTACTOE.Model;

import java.util.ArrayList;


public class Board {
   public int size;
   public PlayingPiece [][]board;

    public Board(int size){
        this.size = size;
        board = new PlayingPiece[size][size];
    }

    public boolean addPieces(int row, int col, PlayingPiece playingPiece){
        if(board[row][col] != null){
            return false;
        }
        board[row][col] = playingPiece;
        return true;


    }

    public ArrayList<Pair<Integer,Integer>> emptyCells(){
        ArrayList<Pair<Integer,Integer>> cells = new ArrayList<>();
        for(int row = 0; row < size; row++){
            for(int col = 0; col < size; col++){
                if(board[row][col] == null){
                    cells.add(new Pair<>(row, col));
                }
            }
        }
        return cells;
    }

 public void printBoard() {

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (board[i][j] != null) {
                    System.out.print(board[i][j].symbol + "   ");
                } else {
                    System.out.print("    ");

                }
                System.out.print(" | ");
            }
            System.out.println();

        }
    }

}
