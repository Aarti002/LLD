package ChessGame.Core;

import ChessGame.PieceFactory.PieceFactory;

public class Board {
    private Cell[][] board;

    public Board(){
        board = new Cell[8][8];
        initialiseBoard();
    }

    public Cell getCell(int row, int col){
        return board[row][col];
    }

    private void initialiseBoard() {
        setPawnRow(1,true);
        setPiecesRow(0,true);

        setPawnRow(6,false);
        setPiecesRow(7,false);
        for(int i=2;i<6;i++){
            for(int j=0;j<8;j++){
                this.board[i][j] = new Cell(i,j,null);
            }
        }
    }

    private void setPawnRow(int row, boolean isBlack) {
        for(int i=0;i<8;i++){
            this.board[row][i] = new Cell(row, i, PieceFactory.createPiece("Pawn", isBlack));
        }
    }

    private void setPiecesRow(int row, boolean isBlack) {
        this.board[row][0] = new Cell(row, 0, PieceFactory.createPiece("Rook", isBlack));
        this.board[row][1] = new Cell(row, 1, PieceFactory.createPiece("Bishop", isBlack));
        this.board[row][2] = new Cell(row, 2, PieceFactory.createPiece("Knight", isBlack));
        this.board[row][3] = new Cell(row, 3, PieceFactory.createPiece("King", isBlack));
        this.board[row][4] = new Cell(row, 4, PieceFactory.createPiece("Queen", isBlack));
        this.board[row][5] = new Cell(row, 5, PieceFactory.createPiece("Knight", isBlack));
        this.board[row][6] = new Cell(row, 6, PieceFactory.createPiece("Bishop", isBlack));
        this.board[row][7] = new Cell(row, 7, PieceFactory.createPiece("Rook", isBlack));
    }
}
