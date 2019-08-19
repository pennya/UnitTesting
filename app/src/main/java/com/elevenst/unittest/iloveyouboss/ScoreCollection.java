package com.elevenst.unittest.iloveyouboss;

import android.annotation.TargetApi;
import android.os.Build;

import java.util.ArrayList;
import java.util.List;

public class ScoreCollection {
    private List<Scoreable> scores = new ArrayList<>();

    public void add(Scoreable scoreable) {
        scores.add(scoreable);
    }

    @TargetApi(Build.VERSION_CODES.N)
    public int arithmeticMean() {
        int total = scores.stream().mapToInt(Scoreable::getScore).sum();
        return total / scores.size();
    }
}
