package ChessGame.PieceFactory.ConcretePieces;

import ChessGame.Core.Board;
import ChessGame.Core.Cell;
import ChessGame.MoveStrategy.ConcreteMove.QueenMoveStrategy;
import ChessGame.PieceFactory.Piece;

public class Queen extends Piece {
    public Queen(boolean type) {
        super(new QueenMoveStrategy(), type);
    }

    @Override
    public boolean canMove(Board board, Cell startCell, Cell endCell) {
        return super.canMove(board, startCell, endCell);
    }
}
