package com.technogise.chessboard.pieces;

import java.util.List;

import com.technogise.chessboard.Cell;

public interface IPiece {
	public List<Cell> getPossibleCells(int chessBoardSize, Cell fromCell);
}
