package org.example.TicTacToe;

import org.example.TicTacToe.Entities.Game;

public class Main {
    public static void main(String [] args){
        Game game=Game.initializeGame();
        game.beginGame();
    }
}
