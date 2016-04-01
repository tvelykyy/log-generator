package com.tvelykyy.loggenerator.referrer;

import java.util.Random;

public class RandomReferrerGenerator implements ReferrerGenerator {
    private static final Random R = new Random();
    private static final Referrers refs = new Referrers();

    @Override
    public String generate() {
        return refs.getReferrer(R.nextInt(refs.getCount()));
    }
}
