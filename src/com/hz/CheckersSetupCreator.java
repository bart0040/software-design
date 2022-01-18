package com.hz;

import java.util.Arrays;
import java.util.List;

public class CheckersSetupCreator extends GameSetupCreator{
    @Override
    Pawns[] getPawns() {
        int numberOfPawns = 40;
        System.out.println("The pawns:");
        List[] pawnAndColor = Colors.getColor(numberOfPawns);
        System.out.println(Arrays.toString(pawnAndColor));

        return new Pawns[numberOfPawns];
    }

    @Override
    Rules[] getRules() {
        return new Rules[0];
    }

    @Override
    Board getBoard() {
        System.out.println("Selected checkers");
        System.out.println("The squares:");
        int numberOfSquares = 100;
        List[] squareAndColor = Colors.getColor(numberOfSquares);
        System.out.println(Arrays.toString(squareAndColor));
        return new CheckersBoard();
    }
}
