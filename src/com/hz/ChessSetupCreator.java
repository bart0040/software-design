package com.hz;

import java.awt.*;
import java.util.Arrays;
import java.util.List;

public class ChessSetupCreator extends GameSetupCreator {
    @Override
    Pawns[] getPawns() {
        int numberOfPawns = 32;
        System.out.println("selected chess");
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
        return new ChessBoard();
    }
}
