package com.tvelykyy.loggenerator.statuscode;


import com.tvelykyy.loggenerator.DistributedRandomNumberGenerator;

public class RandomWithProbabilityStatusCodeGenerator implements StatusCodeGenerator {
    DistributedRandomNumberGenerator generator;

    public RandomWithProbabilityStatusCodeGenerator() {
        generator = new DistributedRandomNumberGenerator();
        generator.addNumber(200, 0.9d);
        generator.addNumber(404, 0.05d);
        generator.addNumber(503, 0.05d);
    }
    @Override
    public int generate() {
        return generator.getDistributedRandomNumber();
    }

}
