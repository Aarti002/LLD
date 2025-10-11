package TicTacToa.utils;

import TicTacToa.models.Board;
import TicTacToa.models.Player;
import TicTacToa.models.PlayingPiece;

public class checkBoardState {

    public static boolean hasWon(Player player, Board gameBoard) {
        int size = gameBoard.size;
        PlayingPiece piece = player.selectedPiece;

        // Check rows
        for (int i = 0; i < size; i++) {
            boolean rowMatch = true;
            for (int j = 0; j < size; j++) {
                if (gameBoard.board[i][j] != piece) {
                    rowMatch = false;
                    break;
                }
            }
            if (rowMatch) return true;
        }

        // Check columns
        for (int j = 0; j < size; j++) {
            boolean colMatch = true;
            for (int i = 0; i < size; i++) {
                if (gameBoard.board[i][j] != piece) {
                    colMatch = false;
                    break;
                }
            }
            if (colMatch) return true;
        }

        // Check main diagonal
        boolean mainDiagonal = true;
        for (int i = 0; i < size; i++) {
            if (gameBoard.board[i][i] != piece) {
                mainDiagonal = false;
                break;
            }
        }
        if (mainDiagonal) return true;

        // Check anti-diagonal
        boolean antiDiagonal = true;
        for (int i = 0; i < size; i++) {
            if (gameBoard.board[i][size - 1 - i] != piece) {
                antiDiagonal = false;
                break;
            }
        }
        if (antiDiagonal) return true;

        // No win condition met
        return false;
    }
}
