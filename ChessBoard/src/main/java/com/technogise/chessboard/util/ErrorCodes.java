package com.technogise.chessboard.util;

public enum ErrorCodes {
	ERROR_INVALID_INPUT("Invalid Input. Please specify in format ->TYPE CELL_NUMBER");

	private String errorCode;
	
	ErrorCodes(String errorCode) {
		this.setErrorCode(errorCode);
	}
	//Error codes

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
}
