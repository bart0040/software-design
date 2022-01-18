package com.hz;

public class MenuState extends State {

    MenuState(Player player) {
        super(player);
        player.setPlaying(false);
    }

    @Override
    public String onPlay() {
        player.changeState(new PlayingState(player));
        return "Start playing";
    }

    @Override
    public String onPause() {
        return "Locked...";
    }

    @Override
    public String onQuit() {
        return "Locked...";
    }
}
