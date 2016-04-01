package com.tvelykyy.loggenerator.useragent;

import java.util.Random;

public class RandomUserAgentGenerator implements UserAgentGenerator {
    private final Random R = new Random();

    public String generate() {
        UserAgent[] agents = UserAgent.values();
        int ordinal = R.nextInt(agents.length);

        for(UserAgent agent : agents) {
            if (agent.ordinal() == ordinal)
                return agent.getDetailed();
        }

        return UserAgent.CHROME_41.getDetailed();
    }
}
