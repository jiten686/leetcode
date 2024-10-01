package ticTacToe;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class TicTacToeGame {
	Deque<Player> players;
	Board gamingBoard;

	public TicTacToeGame() {
		initializeGame();
	}

	private void initializeGame() {

		players = new LinkedList<>();

		PlayingPiece crossPiece = new PlayingPieceX(PieceType.X);
		Player player1 = new Player("p1", crossPiece);

		PlayingPiece oPiece = new PlayingPieceO(PieceType.O);
		Player player2 = new Player("p2", oPiece);

		players.add(player1);
		players.add(player2);

		this.gamingBoard = new Board(3);

	}

	public String startGame() {

		boolean foundWinner = false;

		while (!foundWinner) {

			// take out the player whose turn and after that put it back into list;
			Player player_turn = this.players.removeFirst();

			// get free space from gamingBoard.
			List<Pair<Integer, Integer>> freeSpace = this.gamingBoard.getFreeCells();
			if (freeSpace.isEmpty()) {
				// there is no space the game is Tie
				foundWinner = true;
				continue;
			}

			// read the user input
			System.out.println("Player " + player_turn.getName() + " Enter row,col: ");
			Scanner sc = new Scanner(System.in);
			String str = sc.nextLine();
			String[] val = str.split(",");
			int row = Integer.valueOf(val[0]);
			int col = Integer.valueOf(val[1]);

			// place the piece
			boolean pieceAddedSucessfully = this.gamingBoard.addPiece(row, col, player_turn.getPlayingPiece());

			if (!pieceAddedSucessfully) {
				// retry
				System.out.println("Incorrect Position ...try again");
				this.players.addFirst(player_turn);
				continue;
			}

			players.addLast(player_turn);

			// is there any winner
			boolean winner = isThereWinner(row, col, player_turn.getPlayingPiece().pieceType);

			if (winner) {
				return player_turn.getName();
			}

		}

		return "tie";

	}

	private boolean isThereWinner(int row, int col, PieceType pieceType) {
		boolean rowMatch = true;
		boolean colMatch = true;
		boolean diagonalMatch = true;
		boolean antDiagonalMatch = true;

		// check row
		for (int i = 0; i < this.gamingBoard.size; i++) {
			if (gamingBoard.board[row][i] == null || gamingBoard.board[row][i].pieceType != pieceType) {
				rowMatch = false;
			}

		}

		// check col
		for (int i = 0; i < this.gamingBoard.size; i++) {
			if (gamingBoard.board[i][col] == null || gamingBoard.board[i][col].pieceType != pieceType) {
				colMatch = false;
			}
		}

		// check diagonal
		for (int i = 0, j = 0; i < this.gamingBoard.size; i++, j++) {
			if (gamingBoard.board[i][j] == null || gamingBoard.board[i][j].pieceType != pieceType) {
				diagonalMatch = false;
			}
		}

		// check anti-diagonal
		for (int i = 0, j = gamingBoard.size - 1; i < this.gamingBoard.size; i++, j--) {
			if (gamingBoard.board[i][j] == null || gamingBoard.board[i][j].pieceType != pieceType) {
				antDiagonalMatch = false;
			}
		}

		return rowMatch || colMatch || diagonalMatch || antDiagonalMatch;
	}

}
