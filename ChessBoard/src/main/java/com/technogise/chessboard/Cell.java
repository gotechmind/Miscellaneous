package com.technogise.chessboard;

public class Cell {
	private int row;
	private int column;
	public Cell(int row, int column) {
		this.setRow(row);
		this.setColumn(column);
	}
	public int getColumn() {
		return column;
	}
	public void setColumn(int column) {
		this.column = column;
	}
	public int getRow() {
		return row;
	}
	public void setRow(int row) {
		this.row = row;
	}
	
}
