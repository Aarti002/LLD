package ChessGame.Core;

public class Move {
    private Cell startCell;
    private Cell endCell;

    public Move(Cell start, Cell end) {
        this.startCell = start;
        this.endCell = end;
    }

    public Cell getStartCell() {
        return this.startCell;
    }

    public Cell getEndCell() {
        return this.endCell;
    }
}
