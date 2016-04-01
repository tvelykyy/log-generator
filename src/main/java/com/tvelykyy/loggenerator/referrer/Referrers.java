package com.tvelykyy.loggenerator.referrer;

import java.util.ArrayList;
import java.util.List;

public class Referrers {

    private List<String> refs = new ArrayList<>();

    public Referrers() {
        refs.add("http://google.com/search");
        refs.add("http://google.com/webhp");
        refs.add("http://yahoo.com/search");
        refs.add("http://bing.com/search.php");
        refs.add("http://gigablast.com/");
    }

    public String getReferrer(int index) {
        return refs.get(index);
    }

    public int getCount() {
        return refs.size();
    }
}
