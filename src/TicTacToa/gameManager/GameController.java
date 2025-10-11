package TicTacToa.gameManager;

import TicTacToa.models.Board;
import TicTacToa.models.Player;
import TicTacToa.utils.checkBoardState;
import TicTacToa.utils.Pair;


import java.util.*;

public class GameController {
    Deque<Player> players;
    Board gameBoard;

    public GameController() {
        initialiseGame();
    }

    public void initialiseGame() {
        this.players = new LinkedList<>();
        PlayerX firstPlayer = new PlayerX();
        PlayerO secondPlayer = new PlayerO();
        players.add(firstPlayer);
        players.add(secondPlayer);
        this.gameBoard = new Board(3);
    }

    public void runGame() {
        boolean flag = true;

        while (flag) {
            Player currPlayer = players.poll();
            List<Pair<Integer,Integer>> positionsList = gameBoard.getAvailableCoordinates();
            if(positionsList.isEmpty()){
                System.out.println("Space not available. That's a Draw!");
                break;
            }
            System.out.println("Current Player name: "+currPlayer.name);
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter row and col: ");
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            boolean actionComp = gameBoard.addPiece(x,y,currPlayer.selectedPiece);
            if(!actionComp){
                System.out.println("Something went wrong, try again.");
                players.addFirst(currPlayer);
                continue;
            }

            gameBoard.printBoard();

            boolean isWinner = checkBoardState.hasWon(currPlayer, gameBoard);
            if (isWinner) {
                System.out.println("Player "+currPlayer.name+" has won the Game!");
                flag = false;
                break;
            }
            players.addLast(currPlayer);
        }
    }
}
