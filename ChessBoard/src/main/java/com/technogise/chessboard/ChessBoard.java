package com.technogise.chessboard;

public class ChessBoard {

	private int size;
	private String[][] chessBoardCells;

	public ChessBoard(int size) {
		this.size = size;
		this.chessBoardCells = new String[size][size];
		buildChessBoard();
	}

	private void buildChessBoard() {
		for(int i=0; i < size; i++) {
			for(int j=0; j < size; j++) {
				this.chessBoardCells[i][j] = "" + (char)('A' + j) + (size - i);
			}		
		}
	}

	public String[][] getChessBoardCells() {
		return chessBoardCells;
	}

	public int getSize() {
		return size;
	}
}
