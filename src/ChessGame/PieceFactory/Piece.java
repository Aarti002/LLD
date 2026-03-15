package ChessGame.PieceFactory;

import ChessGame.Core.Board;
import ChessGame.Core.Cell;
import ChessGame.MoveStrategy.IMoveStrategy;

public abstract class Piece {
    boolean isBlack;
    IMoveStrategy moveStrategy;
    boolean isPlaying;

    public Piece(IMoveStrategy move, boolean type) {
        this.isBlack = type;
        this.moveStrategy = move;
        this.isPlaying = true;
    }

    public boolean isPlaying() {
        return isPlaying;
    }

    public void setPlaying(boolean isPlaying) {
        this.isPlaying = isPlaying;
    }

    public IMoveStrategy getMoveStrategy() {
        return moveStrategy;
    }

    public boolean isBlack() {
        return isBlack;
    }

    public boolean canMove(Board board, Cell startCell, Cell endCell) {
        return moveStrategy.nextMove(board, startCell, endCell);
    }
}
