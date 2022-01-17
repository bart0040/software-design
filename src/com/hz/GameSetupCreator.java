package com.hz;

public abstract class GameSetupCreator {

    abstract Pawns[] getPawns();

    abstract Rules[] getRules();

    abstract Board getBoard();
}
