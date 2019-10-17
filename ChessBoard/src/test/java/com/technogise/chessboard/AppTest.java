package com.technogise.chessboard;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AppTest {
	@Test
	public void testGetPossibleCells() {
		assertEquals("D6, E6, E5, E4, D4, C4, C5, C6", App.getPossibleCells("King", "D5"));
	}
}
