package com.tvelykyy.loggenerator.page;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Pages {
    private static final Random R = new Random();
    private static final int SIZE_BOUND = 1000;
    private static final int PAGES_COUNT = 1000;

    private List<Page> pages = new ArrayList<>();

    public Pages() {
        for (int i = 0; i < PAGES_COUNT; i++) {
            pages.add(new Page("/news/" + i + ".html", R.nextInt(SIZE_BOUND)));
        }
    }

    public Page getPage(int index) {
        return pages.get(index);
    }

    public int getCount() {
        return pages.size();
    }


}


