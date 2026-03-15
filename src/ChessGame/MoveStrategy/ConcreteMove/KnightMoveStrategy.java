package ChessGame.MoveStrategy.ConcreteMove;

import ChessGame.Core.Board;
import ChessGame.Core.Cell;
import ChessGame.MoveStrategy.IMoveStrategy;

public class KnightMoveStrategy implements IMoveStrategy {
    @Override
    public boolean nextMove(Board board, Cell start, Cell end) {
        return true;
    }
}
