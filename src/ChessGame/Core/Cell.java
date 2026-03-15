package ChessGame.Core;

import ChessGame.PieceFactory.Piece;

public class Cell {
    private int x;
    private int y;
    private boolean isBlack;
    private Piece piece;

    public Cell(int x,int y,Piece piece) {
        this.x=x;
        this.y=y;
        this.piece=piece;
    }

    public Piece getPiece() {
        return this.piece;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }
}
