package ChessGame.Controller;

import ChessGame.Core.Board;
import ChessGame.Core.Cell;
import ChessGame.Core.Move;
import ChessGame.Core.Player;
import ChessGame.PieceFactory.Piece;

public class ChessGame {
    private Player player1;
    private Player player2;
    private Board board;

    private Player currentPlayer;

    public ChessGame(Player p1, Player p2){
        this.player1 = p1;
        this.player2 = p2;

        board = new Board();
        currentPlayer = player1;
    }

    public Board getBoard() {
        return this.board;
    }

    public boolean makeMove(Move move){
        Cell start = move.getStartCell();
        Cell end = move.getEndCell();

        Piece piece = start.getPiece();

        if(piece == null){
            return false;
        }
        if(piece.isBlack() != currentPlayer.isBlack()){
            return false;
        }

        if(!piece.canMove(board, start, end)){
            return false;
        }

        if(end.getPiece() != null){
            end.getPiece().setPlaying(false);
        }

        end.setPiece(piece);
        start.setPiece(null);
        switchPlayer();
        return true;
    }

    private void switchPlayer(){
        if(currentPlayer == player1){
            currentPlayer = player2;
        } else {
            currentPlayer = player1;
        }
    }
}
