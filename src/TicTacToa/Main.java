package TicTacToa;

import TicTacToa.gameManager.GameController;

public class Main {
    public static void main(String args[]){
        GameController tictactoa = new GameController();
        System.out.println("---Tic-Tac-Toa---");
        tictactoa.runGame();
    }
}
