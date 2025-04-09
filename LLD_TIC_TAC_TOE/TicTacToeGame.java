package LLD_TIC_TAC_TOE;

import LLD_TIC_TAC_TOE.models.Player;
import java.util.Deque;
import java.util.List;
import java.util.Scanner;

public class TicTacToeGame {
    Deque<Player> players;
    Board gameBoard;

    TicTacToeGame() {
        initializeGame();
    }

    public void initializeGame() {
        players = new LinkedList<>();
        PlayingPieceX crossPiece = new PlayingPieceX();
        Player player1 = new Player("Player 1", crossPiece);
        PlayingPieceO circlePiece = new PlayingPieceO();
        Player player2 = new Player("Player 2", circlePiece);
        players.add(player1);
        players.add(player2);
        gameBoard = new Board(3);
    }

    public String startGame() {
        boolean noWinner = true;
        while (noWinner) {
            gameBoard.printBoard();
            Player playerTurn = players.removeFirst();
            List<Pair> freeSpaces = gameBoard.getFreeCells();
            if (freeSpaces.isEmpty()) {
                noWinner = false;
                continue;
            }
            System.out.println("Player:" + playerTurn.name + "Enter row and column");
            Scanner inputScanner = new Scanner(System.in);
            String s = inputScanner.nextLine();
            String values[] = s.split(" ");
            int inputRow = Integer.valueOf(values[0]);
            int inputCol = Integer.valueOf(values[1]);
            // Place the Piece
            boolean pieceAddedSuccessfully = gameBoard.addPiece(inputRow, inputCol, playerTurn.playingPiece);
            if (!pieceAddedSuccessfully) {
                System.out.println("Invalid Move");
                players.addFirst(playerTurn);
                continue;
            }
            players.addLast(playerTurn);
            boolean isWinner = isThereWinner(inputRow, inputCol, playerTurn.playingPiece.pieceType);
            if (isWinner) {
                return playerTurn.name;
            }
        }

    }

    public boolean isThereWinner(int row, int col, PieceType pieceType) {
        boolean rowMatch = false;
        boolean colMatch = false;
        boolean diagonalMatch = false;
        boolean antiDiagnalMatch = false;
        // Check Row
        for (int i = 0; i < gameBoard[0].length; i++) {
            if (gameBoard[row][i] == null && gameBoard[row][i].pieceType != pieceType) {
                rowMatch = false;
            }
        }
        // checking column
        for (int i = 0; i < gameBoard.length; i++) {
            if (gameBoard[i][col] == null && gameBoard[i][col].pieceType != pieceType) {
                colMatch = false;
            }
        }
        // checking diagonal
        for (int i = 0; i < gameBoard.length; i++) {
            if (gameBoard[i][i] == null && gameBoard[i][i].pieceType != pieceType) {
                diagonalMatch = false;
            }
        }
        // checking anti diagonal
        for (int i = 0; i < gameBoard.length; i++) {
            if (gameBoard[i][gameBoard.length - i - 1] == null
                    && gameBoard[i][gameBoard.length - i - 1].pieceType != pieceType) {
                antiDiagnalMatch = false;
            }
        }
        return rowMatch || colMatch || diagonalMatch || antiDiagnalMatch;

    }
}
