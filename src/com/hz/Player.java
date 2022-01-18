package com.hz;

public class Player {
    private State state;
    private boolean playing = false;

    public Player() {
        this.state = new MenuState(this);
        setPlaying(false);
    }

    public void changeState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public void setPlaying(boolean playing) {
        this.playing = playing;
    }

    public boolean isPlaying() {
        return playing;
    }
}
