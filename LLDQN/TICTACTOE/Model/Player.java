package TICTACTOE.Model;

public class Player {
    String name;
    PlayingPiece PlayingPiece;

    public Player(String name, PlayingPiece PlayingPiece){
        this.PlayingPiece = PlayingPiece;
        this.name = name;
    }
    
    public String getPlayerName(){
        return name;
    }
    public PlayingPiece getPlayingPiece(){
        return PlayingPiece;
    }

    
}
