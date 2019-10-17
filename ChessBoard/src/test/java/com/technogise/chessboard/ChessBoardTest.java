package com.technogise.chessboard;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import com.technogise.chessboard.ChessBoard;

public class ChessBoardTest {
@Test
	public void testChessBoardCreation() {
		ChessBoard chessBoard = new ChessBoard(2);
		
		String[][] chessBoardCellNumbers = chessBoard.getChessBoardCells(); 
		
		assertEquals("A2", chessBoardCellNumbers[0][0]);
		assertEquals("B2", chessBoardCellNumbers[0][1]);
		assertEquals("A1", chessBoardCellNumbers[1][0]);
		assertEquals("B1", chessBoardCellNumbers[1][1]);
	}
}
