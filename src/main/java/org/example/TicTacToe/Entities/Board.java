package org.example.TicTacToe.Entities;

public class Board {
    public Integer size;
    public Piece[][] gameBoard;

    Board(Integer size) {
        this.size = size;
        gameBoard = new Piece[size][size];
    }

    public void displayBoard() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                Character character = (gameBoard[i][j] != null ? gameBoard[i][j].getSymbol() : '.');
                System.out.print(character + " ");
            }
            System.out.println();
        }
    }

    public void put(int x, int y, Piece piece) {
        gameBoard[x][y] = piece;
    }

    public boolean checkWinner() {
        // any row
        for (int i = 0; i < size; i++) {
            if (gameBoard[i][0] == null) continue;
            boolean isPoss = true;
            for (int j = 1; j < size; j++) {
                if (gameBoard[i][j - 1] != gameBoard[i][j]) {
                    isPoss = false;
                    break;
                }
            }
            if (isPoss) return true;
        }

        //any col
        for (int i = 0; i < size; i++) {
            if (gameBoard[0][i] == null) continue;
            boolean isPoss = true;
            for (int j = 1; j < size; j++) {
                if (gameBoard[j - 1][i] != gameBoard[j][i]) {
                    isPoss = false;
                    break;
                }
            }
            if (isPoss) return true;
        }

        //diag
        int x = 0, y = 0;
        Character curr = (gameBoard[x][y] != null ? gameBoard[x][y].getSymbol() : null);
        if (curr != null) {
            boolean isPoss = true;
            while (x < size && y < size) {
                if (gameBoard[x][y] == null || !gameBoard[x][y].getSymbol().equals(curr)) isPoss = false;
                x++;
                y++;
            }
            if (isPoss) return true;
        }

        x = 0;
        y = size - 1;
        curr = (gameBoard[x][y] != null ? gameBoard[x][y].getSymbol() : null);
        if (curr != null) {
            boolean isPoss = true;
            while (x < size && y >= 0) {
                if (gameBoard[x][y] == null || !gameBoard[x][y].getSymbol().equals(curr)) isPoss = false;
                x++;
                y--;
            }
            if (isPoss) return true;
        }

        return false;
    }
}
