package com.jmx.calculator.service.impl;

import com.jmx.calculator.model.Operation;
import com.jmx.calculator.service.MulService;

public class MulServiceImpl extends Operation implements MulService {
    @Override
    public Double getResult() {
        Double result = 0D;
        result = numberA * numberB;
        return result;
    }
}
