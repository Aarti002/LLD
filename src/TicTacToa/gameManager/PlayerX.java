package TicTacToa.gameManager;

import TicTacToa.enums.PieceType;
import TicTacToa.models.Player;
import TicTacToa.models.PlayingPiece;

public class PlayerX extends Player {

    public PlayerX(){
        super("Aarti", new PlayingPiece(PieceType.X));
    }
}
