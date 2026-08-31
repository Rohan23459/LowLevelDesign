package TICTACTOE;

import TICTACTOE.Model.Board;
import TICTACTOE.Model.GameStatus;
import TICTACTOE.Model.Pair;
import TICTACTOE.Model.Player;
import TICTACTOE.Model.PlayingPiece;
import TICTACTOE.Model.Symbol;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class TicTacToeGame {

    int boardSize;
    int numOfPlayer;
    Board gameBoard;
    LinkedList<Player>playerList;
    Player winner;

    public TicTacToeGame(int boardSize, int numOfPlayer){
        this.boardSize = boardSize;
        this.numOfPlayer = numOfPlayer;
    }



    public void InitialiseGame(){
        gameBoard = new Board(boardSize);
        playerList = new LinkedList<>();
        PlayingPiece playingPieceX = new PlayingPiece(Symbol.X);
        PlayingPiece playingPieceO = new PlayingPiece(Symbol.O);
        


        Player playerX = new Player("Rohan", playingPieceX);
        Player playerO = new Player("Mohan", playingPieceO);

        playerList.add(playerO);
        playerList.add(playerX);

        





    };

    public GameStatus StartGame(){
        boolean noWinner = true;
        while(noWinner){
            Player currentPlayer = playerList.removeFirst();


             // Read the user input
            System.out.print("Player: " + currentPlayer.getPlayerName() + " - Please enter [row, column]: ");
            Scanner inputScanner = new Scanner(System.in);
            String s = inputScanner.nextLine();
            String[] values = s.split(",");
            int inputRow = Integer.valueOf(values[0]);
            int inputColumn = Integer.valueOf(values[1]);

             boolean isValidAttempt = gameBoard.addPieces(inputRow, inputColumn, currentPlayer.getPlayingPiece());
            if(!isValidAttempt){
                System.out.println("You are choosing the Cell has already filled");
                playerList.addFirst(currentPlayer);
            }
             gameBoard.printBoard();
            if(checkForWinner(inputRow,inputColumn,currentPlayer.getPlayingPiece().getSymbol())){
               
                winner = currentPlayer;
                System.out.println("Winner of this game is :"+ currentPlayer.getPlayerName());
                return GameStatus.WIN;
                
            }
            playerList.addLast(currentPlayer);

           ArrayList<Pair<Integer, Integer>> emptyCells =  gameBoard.emptyCells();

           if(emptyCells.isEmpty()){
            noWinner = false;
            
           }
           



        }
        System.out.println("This game is draw");

        return GameStatus.DRAW;
    };

    private boolean checkForWinner(int row, int column, Symbol symbol) {

        boolean rowMatch = true;
        boolean columnMatch = true;
        boolean diagonalMatch = true;
        boolean antiDiagonalMatch = true;

        // Check Row
        for (int i = 0; i < boardSize; i++) {
            if(gameBoard.board[row][i] == null || gameBoard.board[row][i].getSymbol() != symbol){
                rowMatch = false;
                break;
            }
        }

        // Check Column
        for (int i = 0; i < boardSize; i++) {
            if (gameBoard.board[i][column] == null || gameBoard.board[i][column].getSymbol() != symbol) {
                columnMatch = false;
                break;
            }
        }

        // Check Diagonally
        for (int i = 0, j = 0; i < boardSize; i++, j++) {
            if (gameBoard.board[i][j] == null || gameBoard.board[i][j].getSymbol() != symbol) {
                diagonalMatch = false;
                break;
            }
        }

        // Check Anti-Diagonally
        for (int i = 0, j = boardSize - 1; i < boardSize; i++, j--) {
            if (gameBoard.board[i][j] == null || gameBoard.board[i][j].getSymbol() != symbol) {
                antiDiagonalMatch = false;
                break;
            }
        }

        return rowMatch || columnMatch || diagonalMatch || antiDiagonalMatch;
    }

    
}
