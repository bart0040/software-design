package com.hz;

public class Main {

    public static void main(String[] args) {
	// write your code here

        ConsoleWriter writer = new ConsoleWriter();
        ConsoleReader reader = new ConsoleReader();

        // Ask user which game to play
        String q1 = "Do you want to play Chess [1] or Checkers [2]?";

        writer.write(q1);

        GameSetupCreator gameSetupCreator;
        String choice = reader.readLine();

        if(choice.equals("1")) {
            gameSetupCreator = new ChessSetupCreator();
        } else {
            gameSetupCreator = new CheckersSetupCreator();
        }

        // Board

        gameSetupCreator.getBoard();

        // Pawns

        gameSetupCreator.getPawns();

        // Rules: allowed moves, time constrains.

        // Two players

        // play mode: turns
    }
}
