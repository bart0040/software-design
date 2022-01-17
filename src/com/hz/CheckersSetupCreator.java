package com.hz;

public class CheckersSetupCreator extends GameSetupCreator{
    @Override
    Pawns[] getPawns() {
        return new Pawns[20 * 2];
    }

    @Override
    Rules[] getRules() {
        return new Rules[0];
    }

    @Override
    Board getBoard() {
        return new CheckersBoard();
    }
}
