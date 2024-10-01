package ticTacToe;

import java.util.ArrayList;
import java.util.List;

public class Board {
	int size;
	PlayingPiece[][] board;

	public Board(int size) {
		this.size = size;
		this.board = new PlayingPiece[size][size];
	}

	public boolean addPiece(int row, int col, PlayingPiece piece) {
		if (this.board[row][col] != null) {
			return false;
		}

		this.board[row][col] = piece;
		return true;
	}

	public List<Pair<Integer, Integer>> getFreeCells() {
		List<Pair<Integer, Integer>> list = new ArrayList<>();
		for(int i=0;i<size;i++) {
			for(int j=0;j<size;j++) {
				if(board[i][j] == null) {
					list.add(new Pair<>(i,j));
				}
					
			}
		}
		return list;
	}

}
