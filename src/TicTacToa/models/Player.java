package TicTacToa.models;

import TicTacToa.gameManager.PlayerO;

public abstract class Player {
    public String name;
    public PlayingPiece selectedPiece;

    protected Player(String name, PlayingPiece piece){
        this.name = name;
        this.selectedPiece = piece;
    }
}