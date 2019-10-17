package com.technogise.chessboard;

import static org.junit.Assert.assertEquals;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import com.technogise.chessboard.ChessBoard;
import com.technogise.chessboard.ChessBoardCellUtil;
import com.technogise.chessboard.util.ErrorCodes;

public class ChessBoardCellUtilTest {
	
	@Rule
	public ExpectedException expectedEx = ExpectedException.none();
	
	@Test
	public void testValidPosibleCellsForPieces() {
		ChessBoard chessBoard = new ChessBoard(8);
		ChessBoardCellUtil chessBoardCellUtil = new ChessBoardCellUtil(chessBoard);
		
	    assertEquals("D6, E6, E5, E4, D4, C4, C5, C6", chessBoardCellUtil.getPosibleCellsFor("King", "D5"));
	    assertEquals("F5, G4, G2, F1, D1, C2, C4, D5", chessBoardCellUtil.getPosibleCellsFor("Horse", "E3"));
	}
	
	@Test
	public void testInvalidCellNumber() {
	    expectedEx.expect(IllegalArgumentException.class);
	    expectedEx.expectMessage(ErrorCodes.ERROR_INVALID_INPUT.getErrorCode());
	    
		ChessBoard chessBoard = new ChessBoard(8);
		ChessBoardCellUtil chessBoardCellUtil = new ChessBoardCellUtil(chessBoard);
	    chessBoardCellUtil.getPosibleCellsFor("King", "45");
	}
	
	@Test
	public void testInvalidPiece() {
	    expectedEx.expect(IllegalArgumentException.class);
	    expectedEx.expectMessage(ErrorCodes.ERROR_INVALID_INPUT.getErrorCode());
	    
		ChessBoard chessBoard = new ChessBoard(8);
		ChessBoardCellUtil chessBoardCellUtil = new ChessBoardCellUtil(chessBoard);
		chessBoardCellUtil.getPosibleCellsFor("Lion", "D5");
	}
}
