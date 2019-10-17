package com.technogise.chessboard;

import java.util.List;

import com.technogise.chessboard.util.ErrorCodes;
import com.technogise.chessboard.util.Pieces;

public class ChessBoardCellUtil {
	
	private ChessBoard chessBoard;
	
	public ChessBoardCellUtil(ChessBoard chessBoard) {
		this.chessBoard = chessBoard;
	}
	
	public String getPosibleCellsFor(String pieceValue, String cellNumber) {
		Pieces piece = Pieces.getPieceFromType(pieceValue);
		Cell cell = getCellFromCellNumber(cellNumber);
		if(piece == null || cell == null) {
			throw new IllegalArgumentException(ErrorCodes.ERROR_INVALID_INPUT.getErrorCode());
		}
		List<Cell> cells = piece.getCellsEvaluator().execute(chessBoard.getSize(), cell);

		StringBuilder positions = new StringBuilder();

		for(int index=0; index < cells.size() ; index++) {
			positions.append(chessBoard.getChessBoardCells()[cells.get(index).getRow()][cells.get(index).getColumn()]);
			if(index != cells.size() -1) {
				positions.append(", ");
			}
		}

		return positions.toString();
	}

	private Cell getCellFromCellNumber(String cellNumber) {
		for(int i=0; i < chessBoard.getSize(); i++) {
			for(int j=0; j < chessBoard.getSize(); j++) {
				if(chessBoard.getChessBoardCells()[i][j].equals(cellNumber)) {
					return new Cell(i,j);
				}
			}		
		}
		return null;
	}
}
