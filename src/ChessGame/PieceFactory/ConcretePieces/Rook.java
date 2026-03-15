package ChessGame.PieceFactory.ConcretePieces;

import ChessGame.Core.Board;
import ChessGame.Core.Cell;
import ChessGame.MoveStrategy.ConcreteMove.RookMoveStrategy;
import ChessGame.PieceFactory.Piece;

public class Rook extends Piece {
    public Rook(boolean type) {
        super(new RookMoveStrategy(), type);
    }

    @Override
    public boolean canMove(Board board, Cell startCell, Cell endCell) {
        return super.canMove(board, startCell, endCell);
    }
}
