package ChessGame.PieceFactory.ConcretePieces;

import ChessGame.Core.Board;
import ChessGame.Core.Cell;
import ChessGame.MoveStrategy.ConcreteMove.PawnMoveStrategy;
import ChessGame.PieceFactory.Piece;

public class Pawn extends Piece {
    public Pawn(boolean type) {
        super(new PawnMoveStrategy(), type);
    }

    @Override
    public boolean canMove(Board board, Cell startCell, Cell endCell) {
        return super.canMove(board, startCell, endCell);
    }
}
