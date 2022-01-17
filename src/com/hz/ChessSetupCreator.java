package com.hz;

public class ChessSetupCreator extends GameSetupCreator{

    @override
    Pawns[] getPawns() {
        return new Panws[0];
    }

    @override
    Rules[] getRules() {
        return new Rules[0];
    }

    @override
    Board[] getBoard() {
        return new ChessBoard();
    }
}
