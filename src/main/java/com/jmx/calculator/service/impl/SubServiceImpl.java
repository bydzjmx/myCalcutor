package com.jmx.calculator.service.impl;

import com.jmx.calculator.model.Operation;
import com.jmx.calculator.service.SubService;

public class SubServiceImpl extends Operation implements SubService {
    @Override
    public Double getResult() {
        Double result = 0D;
        result = numberA - numberB;
        return result;
    }
}
