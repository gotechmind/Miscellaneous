package com.technogise.chessboard.pieces;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

import com.technogise.chessboard.Cell;

public class KingTest {
	@Test
	public void testGetPossibleCells() {
		List<Cell> cells = new King().getPossibleCells(8, new Cell(3,3));
		assertEquals(cells.size(), 8);
		
		assertEquals(2, cells.get(0).getRow());
		assertEquals(3, cells.get(0).getColumn());
		
		assertEquals(2, cells.get(1).getRow());
		assertEquals(4, cells.get(1).getColumn());
		
		assertEquals(3, cells.get(2).getRow());
		assertEquals(4, cells.get(2).getColumn());
		
		assertEquals(4, cells.get(3).getRow());
		assertEquals(4, cells.get(3).getColumn());
		
		assertEquals(4, cells.get(4).getRow());
		assertEquals(3, cells.get(4).getColumn());
		
		assertEquals(4, cells.get(5).getRow());
		assertEquals(2, cells.get(5).getColumn());
	
		assertEquals(3, cells.get(6).getRow());
		assertEquals(2, cells.get(6).getColumn());

		assertEquals(2, cells.get(7).getRow());
		assertEquals(2, cells.get(7).getColumn());

	}
}
