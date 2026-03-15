package ChessGame.PieceFactory.ConcretePieces;

import ChessGame.Core.Board;
import ChessGame.Core.Cell;
import ChessGame.MoveStrategy.ConcreteMove.BishopMoveStrategy;
import ChessGame.PieceFactory.Piece;

public class Bishop extends Piece {
    public Bishop(boolean type) {
        super(new BishopMoveStrategy(), type);
    }

    @Override
    public boolean canMove(Board board, Cell startCell, Cell endCell) {
       return super.canMove(board, startCell, endCell);
    }
}
