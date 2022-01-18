package com.hz;

public class PauseState extends State {

    public PauseState(Player player) {
        super(player);
    }

    @Override
    public String onPlay() {
        player.changeState(new PlayingState(player));
        return "Continue playing";
    }

    @Override
    public String onPause() {
        return "Locked...";
    }

    @Override
    public String onQuit() {
        player.changeState(new MenuState(player));
        return "Quit playing";
    }
}
