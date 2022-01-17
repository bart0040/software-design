package com.hz;

public class CheckersSetupCreator extends GameSetupCreator{
    @override
    Pawns[] getPawns() {
        return new Pawns[20 * 2];
    }

    @override
    Rules[] getRules() {
        return new Rules[0];
    }

    @override
    Board[] getBoard() {
        return new CheckersBoard();
    }
}
