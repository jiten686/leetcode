package snakeAndLadder;

import java.util.concurrent.ThreadLocalRandom;

public class Board {
	Cell[][] cells;

	public Board(int boardSize, int noOfLadder, int noOfSnake) {
		initializeBoard(boardSize);
		addSnakeAndLadder(noOfLadder, noOfSnake);
	}

	private void initializeBoard(int boardSize) {
		this.cells = new Cell[boardSize][boardSize];

		for (int i = 0; i < boardSize; i++) {
			for (int j = 0; j < boardSize; j++) {
				cells[i][j] = new Cell();
			}
		}

	}

	private void addSnakeAndLadder(int noOfLadder, int noOfSnake) {
		while (noOfSnake > 0) {

			int snakeHead = ThreadLocalRandom.current().nextInt(1, cells.length * cells.length - 1);
			int snakeTail = ThreadLocalRandom.current().nextInt(1, cells.length * cells.length - 1);

			if (snakeTail >= snakeHead) {
				continue;
			}

			Jump snakeObj = new Jump();
			snakeObj.start = snakeHead;
			snakeObj.end = snakeTail;

			Cell cell = getCell(snakeHead);
			cell.jump = snakeObj;

			noOfSnake--;
		}

		while (noOfLadder > 0) {

			int ladderStart = ThreadLocalRandom.current().nextInt(1, cells.length * cells.length - 1);
			int ladderEnd = ThreadLocalRandom.current().nextInt(1, cells.length * cells.length - 1);

			if (ladderStart >= ladderEnd) {
				continue;
			}

			Jump ladderObj = new Jump();
			ladderObj.start = ladderStart;
			ladderObj.end = ladderEnd;

			Cell cell = getCell(ladderStart);
			cell.jump = ladderObj;

			noOfLadder--;
		}

	}

	public Cell getCell(int pos) {
		int row = pos / cells.length;
		int col = pos % cells.length;
		return this.cells[row][col];
	}

}
