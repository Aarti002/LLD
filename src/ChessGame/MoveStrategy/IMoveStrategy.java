package ChessGame.MoveStrategy;

import ChessGame.Core.Board;
import ChessGame.Core.Cell;

public interface IMoveStrategy {
    boolean nextMove(Board board, Cell start, Cell end);
}
