package com.technogise.chessboard.pieces;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

import com.technogise.chessboard.Cell;

public class HorseTest {
	@Test
	public void testGetPossibleCells() {
		List<Cell> cells = new Horse().getPossibleCells(8, new Cell(5,4));
		assertEquals(cells.size(), 8);
		
		assertEquals(3, cells.get(0).getRow());
		assertEquals(5, cells.get(0).getColumn());
		
		assertEquals(4, cells.get(1).getRow());
		assertEquals(6, cells.get(1).getColumn());
		
		assertEquals(6, cells.get(2).getRow());
		assertEquals(6, cells.get(2).getColumn());
		
		assertEquals(7, cells.get(3).getRow());
		assertEquals(5, cells.get(3).getColumn());
		
		assertEquals(7, cells.get(4).getRow());
		assertEquals(3, cells.get(4).getColumn());
		
		assertEquals(6, cells.get(5).getRow());
		assertEquals(2, cells.get(5).getColumn());
	
		assertEquals(4, cells.get(6).getRow());
		assertEquals(2, cells.get(6).getColumn());

		assertEquals(3, cells.get(7).getRow());
		assertEquals(3, cells.get(7).getColumn());

	}
}
