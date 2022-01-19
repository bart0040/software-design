package com.hz;

public abstract class GameSetupCreator {

    abstract Pawn[] getPawns();

    abstract Rules[] getRules();

    abstract Board getBoard();
}
