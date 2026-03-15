package ChessGame.PieceFactory.ConcretePieces;

import ChessGame.Core.Board;
import ChessGame.Core.Cell;
import ChessGame.MoveStrategy.ConcreteMove.KingMoveStrategy;
import ChessGame.PieceFactory.Piece;

public class King extends Piece {
    public King(boolean isBlack){
        super(new KingMoveStrategy(), isBlack);
    }

    @Override
    public boolean canMove(Board board, Cell startCell, Cell endCell) {
        return super.canMove(board, startCell, endCell);
    }
}
