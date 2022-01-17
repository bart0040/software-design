package com.hz;

public class ChessSetupCreator extends GameSetupCreator {
    @Override
    Pawns[] getPawns() {
        return new Pawns[16 * 2];
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
