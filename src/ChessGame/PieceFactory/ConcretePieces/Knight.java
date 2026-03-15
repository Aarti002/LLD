package ChessGame.PieceFactory.ConcretePieces;

import ChessGame.Core.Board;
import ChessGame.Core.Cell;
import ChessGame.MoveStrategy.ConcreteMove.KnightMoveStrategy;
import ChessGame.PieceFactory.Piece;

public class Knight extends Piece {
    public Knight(boolean type) {
        super(new KnightMoveStrategy(), type);
    }

    @Override
    public boolean canMove(Board board, Cell startCell, Cell endCell) {
        return super.canMove(board, startCell, endCell);
    }
}
