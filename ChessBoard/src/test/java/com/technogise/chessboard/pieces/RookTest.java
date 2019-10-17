package com.technogise.chessboard.pieces;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

import com.technogise.chessboard.Cell;

public class RookTest {
	/*00 01 02
	10 11 12
	20 21 22*/
	@Test
	public void testGetPossibleCells() {
		List<Cell> cells = new Rook().getPossibleCells(3, new Cell(1,1));
		assertEquals(cells.size(), 4);
		
		assertEquals(0, cells.get(0).getRow());
		assertEquals(1, cells.get(0).getColumn());
		
		assertEquals(1, cells.get(1).getRow());
		assertEquals(2, cells.get(1).getColumn());

		assertEquals(2, cells.get(2).getRow());
		assertEquals(1, cells.get(2).getColumn());
	
		assertEquals(1, cells.get(3).getRow());
		assertEquals(0, cells.get(3).getColumn());

	}
}
