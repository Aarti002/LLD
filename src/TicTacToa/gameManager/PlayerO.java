package TicTacToa.gameManager;

import TicTacToa.enums.PieceType;
import TicTacToa.models.Player;
import TicTacToa.models.PlayingPiece;

public class PlayerO extends Player {

    public PlayerO(){
        super("Ashwin", new PlayingPiece(PieceType.O));
    }
}
