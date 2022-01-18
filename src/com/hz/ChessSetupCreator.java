package com.hz;

import java.awt.*;
import java.util.Arrays;
import java.util.List;

public class ChessSetupCreator extends GameSetupCreator {
    @Override
    Pawns[] getPawns() {
        int numberOfPawns = 32;
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
        System.out.println("Selected chess");
        System.out.println("The squares:");
        int numberOfSquares = 64;
        List[] squareAndColor = Colors.getColor(numberOfSquares);
        System.out.println(Arrays.toString(squareAndColor));
        return new ChessBoard();
    }
}
