package com.technogise.chessboard.pieces;

import java.util.ArrayList;
import java.util.List;

import com.technogise.chessboard.Cell;

public class Horse implements IPiece {

	public List<Cell> getPossibleCells(int chessBoardSize, Cell fromCell) {
		List<Cell> cells = new ArrayList<>();
		int row = fromCell.getRow();
		int column = fromCell.getColumn();
		// Moving clockwise from current position
		if (row-2 >= 0 && column+1 < chessBoardSize) {
			cells.add(new Cell(row - 2,column + 1));
		}
		if(column+2 < chessBoardSize && row - 1 >=0) {
			cells.add(new Cell(row - 1,column + 2));
		}
		if(column+2 < chessBoardSize && row + 1 < chessBoardSize) {
			cells.add(new Cell(row + 1,column+2));
		}
		if(row+2 < chessBoardSize && column + 1 < chessBoardSize) {
			cells.add(new Cell(row + 2,column+1));
		}
		if(row+2 < chessBoardSize && column - 1 >= 0) {
			cells.add(new Cell(row + 2,column-1));
		}
		if(column-2 >=0 && row + 1 <chessBoardSize) {
			cells.add(new Cell(row + 1,column-2));
		}
		if(column-2 >=0 && row - 1 >=0) {
			cells.add(new Cell(row - 1,column-2));
		}
		if(row-2 >=0 && column - 1 >=0) {
			cells.add(new Cell(row - 2,column-1));
		}
		return cells;	
	}
}
