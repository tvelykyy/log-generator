package com.tvelykyy.loggenerator.page;

public class Page {
    private final String path;
    private final int size;

    public Page(String path, int size) {
        this.path = path;
        this.size = size;
    }

    public String getPath() {
        return path;
    }

    public int getSize() {
        return size;
    }
}
