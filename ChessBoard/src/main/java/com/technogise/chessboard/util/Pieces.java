package com.technogise.chessboard.util;

import java.util.List;

import com.technogise.chessboard.Cell;
import com.technogise.chessboard.pieces.Bishop;
import com.technogise.chessboard.pieces.Horse;
import com.technogise.chessboard.pieces.King;
import com.technogise.chessboard.pieces.Pawn;
import com.technogise.chessboard.pieces.Queen;
import com.technogise.chessboard.pieces.Rook;

public enum Pieces {
	
	KING("King",new King()::getPossibleCells),
	HORSE("Horse",new Horse()::getPossibleCells),
	PAWN("Pawn",new Pawn()::getPossibleCells),
	QUEEN("Queen",new Queen()::getPossibleCells),
	BISHOP("Bishop", new Bishop()::getPossibleCells),
	ROOK("Rook", new Rook()::getPossibleCells);
	
	private String type;
	private CellsEvaluator<List<Cell>, Integer, Cell> cellsEvaluator;
	
	Pieces(String type, CellsEvaluator<List<Cell>, Integer, Cell> cellsEvaluator) {
		this.setType(type);
		this.setCellsEvaluator(cellsEvaluator);
	}

	public void setType(String type) {
		this.type = type;
	}

	public CellsEvaluator<List<Cell>, Integer, Cell> getCellsEvaluator() {
		return cellsEvaluator;
	}

	public void setCellsEvaluator(CellsEvaluator<List<Cell>, Integer, Cell> cellsEvaluator) {
		this.cellsEvaluator = cellsEvaluator;
	}
	
	public static Pieces getPieceFromType(String type) {
		for(Pieces piece :Pieces.values()) {
			if(piece.type.equalsIgnoreCase(type)) {
				return piece;
			}
		}
		return null;
	}	
}
