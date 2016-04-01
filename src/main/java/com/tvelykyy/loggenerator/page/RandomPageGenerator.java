package com.tvelykyy.loggenerator.page;

import java.util.Random;

public class RandomPageGenerator implements PageGenerator {
    private static final Random R = new Random();

    private static final Pages pages = new Pages();

    @Override
    public Page generate() {
        return pages.getPage(R.nextInt(pages.getCount()));
    }
}
