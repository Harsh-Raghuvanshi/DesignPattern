package org.example.Questions.TicTacToe.Entities;

public class Piece {
    Character symbol;

    Piece(Character symbol) {
        this.symbol = symbol;
    }

    @Override
    public String toString() {
        return symbol + "";
    }

    public Character getSymbol() {
        return symbol;
    }
}
