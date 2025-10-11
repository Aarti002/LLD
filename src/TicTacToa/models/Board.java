package TicTacToa.models;

import TicTacToa.utils.Pair;

import java.util.ArrayList;
import java.util.List;

public class Board {
    public int size;
    public PlayingPiece[][] board;

    public Board(int size){
        this.size = size;
        this.board = new PlayingPiece[size][size];
    }

    public boolean addPiece(int x, int y, PlayingPiece playingPiece) {
        if(x>size || y>size) {
            System.out.println("Invalid coordinates, choose again!");
            return false;
        }
        if(this.board[x][y] != null) {
            System.out.println("Position already occupied, choose again!");
            return false;
        }
        this.board[x][y] = playingPiece;
        System.out.println("Done!");
        return true;
    }

    public List<Pair<Integer, Integer>> getAvailableCoordinates() {
        List<Pair<Integer, Integer>> coordinates = new ArrayList<>();
        for(int i=0;i<this.size;i++){
            for(int j=0;j<this.size;j++){
                if(this.board[i][j]==null){
                    Pair<Integer, Integer> rowCol = new Pair<>(i,j);
                    coordinates.add(rowCol);
                }
            }
        }
        return coordinates;
    }

    public void printBoard() {
        for(int i=0;i<this.size;i++){
            for(int j=0;j<this.size;j++){
                System.out.print("| " + this.board[i][j]);
            }
            System.out.println();
        }
    }
}
