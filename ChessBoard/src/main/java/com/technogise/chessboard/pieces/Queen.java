package com.technogise.chessboard.pieces;

import java.util.ArrayList;
import java.util.List;

import com.technogise.chessboard.Cell;

public class Queen implements IPiece {
	public List<Cell> getPossibleCells(int chessBoardSize, Cell fromCell) {
		List<Cell> cells = new ArrayList<>();
		int row = fromCell.getRow();
		int column = fromCell.getColumn();
		// Moving clockwise from current position

		if (row-1 >= 0) {
			for(int i=row-1 ; i>=0 ; i--) {
				cells.add(new Cell(i,column));
			}
			if(column+1 < chessBoardSize) {
				for(int i=row-1, k=column+1 ; i>=0 && k<chessBoardSize; i--, k++) {
					cells.add(new Cell(i,k));
				}
			}
		}
		if(column+1 < chessBoardSize) {
			for(int i=column+1 ;i < chessBoardSize ; i++) {
				cells.add(new Cell(row,i));
			}
			if(row+1 < chessBoardSize) {
				for(int i=row+1, k=column+1 ; i < chessBoardSize && k<chessBoardSize; i++, k++) {
					cells.add(new Cell(i,k));
				}
			}
		}
		if(row+1 < chessBoardSize) {
			for(int i=row+1 ;i < chessBoardSize ; i++) {
				cells.add(new Cell(i,column));
			}
			if(column-1 >= 0) {
				for(int i=row+1, k=column-1 ; i < chessBoardSize && k>=0; i++, k--) {
					cells.add(new Cell(i,k));
				}
			}
		}
		if(column-1 >= 0) {
			for(int i=column-1 ;i >=0 ; i--) {
				cells.add(new Cell(row,i));
			}
			if(row-1 >= 0) {
				for(int i=row-1, k=column-1 ; i >=0 && k>=0; i--, k--) {
					cells.add(new Cell(i,k));
				}
			}
		}
		return cells;	
	}
}
