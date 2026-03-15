package ChessGame;

import ChessGame.Controller.ChessGame;
import ChessGame.Core.Cell;
import ChessGame.Core.Move;
import ChessGame.Core.Player;

public class Main {
    static void main(String[] args) {
        Player p1 = new Player("champ1", true);
        Player p2 = new Player("champ2", false);

        ChessGame chess = new ChessGame(p1, p2);
        Cell start = chess.getBoard().getCell(6,0);
        Cell end = chess.getBoard().getCell(4,0);

        Move move = new Move(start, end);
        chess.makeMove(move);
    }
}
