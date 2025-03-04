package org.example.Questions.TicTacToe;

import org.example.Questions.TicTacToe.Entities.Game;

public class Main {
    public static void main(String [] args){
        Game game=Game.initializeGame();
        game.beginGame();
    }
}
