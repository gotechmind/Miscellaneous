package com.technogise.chessboard.util;

@FunctionalInterface
public interface CellsEvaluator<T,U,V> {
	T execute(U u, V v);
}
