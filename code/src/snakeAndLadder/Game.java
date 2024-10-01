package snakeAndLadder;

import java.util.Deque;
import java.util.LinkedList;

public class Game {

	Board board;
	Deque<Player> players = new LinkedList<>();
	Dice dice;
	Player winner;

	public Game() {
		initializeGame();
	}

	private void initializeGame() {
		this.board = new Board(10, 5, 4);
		this.dice = new Dice(1);
		this.winner = null;
		addPlayers();

	}

	private void addPlayers() {
		Player p1 = new Player("p1", 0);
		Player p2 = new Player("p2", 0);
		players.add(p1);
		players.add(p2);

	}

	public void start() {

		while (winner == null) {
			Player player_turn = findPlayerTurn();
			System.out.println("Player : " + player_turn.id + " current pos is : " + player_turn.currentPos);

			// roll dice
			int diceNumber = dice.rollDice();

			int palyerNewPos = player_turn.currentPos + diceNumber;
			palyerNewPos = checkJump(palyerNewPos);
			player_turn.currentPos = palyerNewPos;

			System.out.println("Player : " + player_turn.id + " new pos is : " + player_turn.currentPos);

			if (palyerNewPos >= board.cells.length * board.cells.length - 1) {
				winner = player_turn;
			}
		}

		System.out.println("Winner is " + winner.id);

	}

	private int checkJump(int palyerNewPos) {
		
		if (palyerNewPos > board.cells.length * board.cells.length - 1) {
			return palyerNewPos;
		}
		
		
		Cell cell = board.getCell(palyerNewPos);
		if (cell.jump != null && cell.jump.start == palyerNewPos) {
			String jumpMadeBy = cell.jump.start < cell.jump.end ? "=======ladder======" : "????snake????";
			System.out.println("Jump Made by : " + jumpMadeBy);
			return cell.jump.end;
		}
		return palyerNewPos;
	}

	private Player findPlayerTurn() {
		Player playerTurn = players.removeFirst();
		players.addLast(playerTurn);
		return playerTurn;
	}

}
