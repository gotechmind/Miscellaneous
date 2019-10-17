package com.technogise.chessboard;

import java.util.Scanner;

public class App {
	public static void main(String args[]) {
		final Scanner scanner = new Scanner(System.in);
		String pieceValue = scanner.next();
		String cellNumber = scanner.next();
		System.out.println(getPossibleCells(pieceValue, cellNumber));
	}

	public static String getPossibleCells(String pieceValue, String cellNumber) {
		ChessBoard chessBoard = new ChessBoard(8);
		ChessBoardCellUtil chessBoardCellUtil = new ChessBoardCellUtil(chessBoard);
		return chessBoardCellUtil.getPosibleCellsFor(pieceValue, cellNumber);
	}

}
