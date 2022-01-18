package com.hz;

public abstract class State {
    Player player;

    State(Player player) {
        this.player = player;
    }

    public abstract String onPlay();
    public abstract String onPause();
    public abstract String onQuit();
}
