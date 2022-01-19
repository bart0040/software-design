package com.hz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CheckersSetupCreator extends GameSetupCreator{
    @Override
    Pawn[] getPawns() {
        int numberOfPawns = 20;
        System.out.println("The pawns:");

        List<Pawn> whitePawns = getPawnsSub(new White());
        List<Pawn> blackPawns = getPawnsSub(new Black());

        showPawns(whitePawns);
        showPawns(blackPawns);

        return new Pawn[0];
    }
    private void showPawns(List<Pawn> pawns){
        for (Pawn pawn:pawns) {
            System.out.println(pawn.show());
        }
    }
    private List<Pawn> getPawnsSub(Color color){
        List<Pawn> pawns = new ArrayList<>();
        for (int i = 1; i <= 20; i++) {
            Pawn pawn = new Pawn();
            pawn.setColor(color);
            pawn.setPos(i);
            pawns.add(pawn);
        }
        return pawns;
    }
    @Override
    Rules[] getRules() {
        return new Rules[0];
    }

    @Override
    Board getBoard() {
        System.out.println("Selected checkers");
        return new CheckersBoard();
    }
}
