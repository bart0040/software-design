package com.hz;

public class PlayingState extends State {

    public PlayingState(Player player) {
        super(player);
    }

    @Override
    public String onPlay() {
        return "Locked";
    }

    @Override
    public String onPause() {
        player.changeState(new PauseState(player));
        return "Paused";
    }

    @Override
    public String onQuit() {
        player.changeState(new MenuState(player));
        return "Stop playing";
    }
}
