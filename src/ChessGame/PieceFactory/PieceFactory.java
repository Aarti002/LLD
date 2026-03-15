package ChessGame.PieceFactory;

import ChessGame.PieceFactory.ConcretePieces.*;

public class PieceFactory {

    public static Piece createPiece(String name, boolean isBlack) {
        switch (name) {
            case "King":
                return new King(isBlack);
            case "Queen":
                return new Queen(isBlack);
            case "Bishop":
                return new Bishop(isBlack);
            case "Rook":
                return new Rook(isBlack);
            case "Knight":
                return new Knight(isBlack);
            case "Pawn":
                return new Pawn(isBlack);
            default:
                throw new IllegalArgumentException("Unknown Piece type"+name);
        }
    }
}
