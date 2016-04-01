package com.tvelykyy.loggenerator.ip;

import java.util.Random;

public class StaticIpv4Generator implements Ipv4Generator {
    private static final int BOUND = 255;

    private final String ip;

    public StaticIpv4Generator() {
        Random R = new Random();
        ip = String.format("%s.%s.%s.%s", R.nextInt(BOUND), R.nextInt(BOUND), R.nextInt(BOUND), R.nextInt(BOUND));
    }

    public String generate() {
        return ip;
    }
}
