package com.hz;

import java.util.ArrayList;
import java.util.List;

public class Colors {
    public static List[] getColor(int numberOf) {
        return sliceNumberOf(numberOf);
    }
    public static List[] sliceNumberOf(int numberOf) {
        List ar[] = new List[2];
        List<String> blackValues = new ArrayList<>();
        List<String> whiteValues = new ArrayList<>();
        String black = (String) Black.getColor();
        String white = (String) White.getColor();
        for (int i = 1; i <= numberOf; i++) {
            if (i % 2 != 0) {
                blackValues.add(String.valueOf(i));
            }
            else {
                whiteValues.add(String.valueOf(i));
            }
        }
        blackValues.add(black);
        whiteValues.add(white);

        ar[0] = blackValues;
        ar[1] = whiteValues;
        return ar;
    }
}
