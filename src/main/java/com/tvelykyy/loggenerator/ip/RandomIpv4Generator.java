package com.tvelykyy.loggenerator.ip;

import java.util.Random;

public class RandomIpv4Generator implements Ipv4Generator {
    private static final Random R = new Random();
    private static final int BOUND = 255;

    public String generate() {
        return String.format("%s.%s.%s.%s", R.nextInt(BOUND), R.nextInt(BOUND), R.nextInt(BOUND), R.nextInt(BOUND));
    }
}
