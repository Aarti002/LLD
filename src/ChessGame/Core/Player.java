package ChessGame.Core;

public class Player {
    private String name;
    private boolean hasBlackPieces;

    public Player(String name, boolean isBlack) {
        this.name = name;
        this.hasBlackPieces = isBlack;
    }

    public boolean isBlack() {
        return hasBlackPieces;
    }
}
