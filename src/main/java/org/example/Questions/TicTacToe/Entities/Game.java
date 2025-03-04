package org.example.Questions.TicTacToe.Entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Game {
    List<Player> playerList;
    Board board;
    private static Scanner sc = new Scanner(System.in);


    Game(List<Player> playerList, Board board) {
        this.playerList = playerList;
        this.board = board;
    }

    public static Game initializeGame() {
        System.out.println("... Game Begins ...");
        System.out.println("Enter Number of players : ");
        int n = sc.nextInt();
        sc.nextLine();
        List<Player> players = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter name of " + (i + 1) + " player : ");
            String name = sc.nextLine();
            System.out.println("and Symbol for player is :");
            Character symbol = sc.nextLine().charAt(0);
            players.add(new Player(name, new Piece(symbol)));
        }
        System.out.println("Enter board size : ");
        int size = sc.nextInt();
        Board board = new Board(size);

        return new Game(players, board);
    }

    public void beginGame() {
        int counter = 0;
        while (!board.checkWinner()) {
            int currIndex=(counter% playerList.size());
            System.out.println("Turn " + (counter + 1) + " of player " + playerList.get(currIndex).name);
            System.out.println("Enter co-ordinates : ");
            int x = sc.nextInt(), y = sc.nextInt();
            if (x >= 0 && y >= 0 && x < board.size && y < board.size) {
                board.put(x,y,playerList.get(currIndex).symbol);
            }
            else{
                System.out.println("Invalid points ");
                continue;
            }
            board.displayBoard();
            if(board.checkWinner()){
                System.out.println("Hurrrraaayyyy you won , Player "+playerList.get(currIndex).name+"  Won the Game");
            }
            counter++;
        }
        System.out.println("Game Ended !!!");
    }


}
