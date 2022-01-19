package com.hz;

import java.awt.*;
import java.util.Arrays;
import java.util.List;

public class ChessSetupCreator extends GameSetupCreator {
    @Override
    Pawn[] getPawns() {
        int numberOfPawns = 32;
        System.out.println("The pawns:");
        return new Pawn[0];
    }

    @Override
    Rules[] getRules() {
        return new Rules[0];
    }

    @Override
    Board getBoard() {
        System.out.println("Selected chess");
        return new ChessBoard();
    }
}
