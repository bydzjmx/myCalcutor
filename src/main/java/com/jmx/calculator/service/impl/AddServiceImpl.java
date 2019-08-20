package com.jmx.calculator.service.impl;

import com.jmx.calculator.model.Operation;
import com.jmx.calculator.service.AddService;

public class AddServiceImpl extends Operation implements AddService {
    @Override
    public Double getResult() {
        Double result = 0D;
        result = numberA + numberB;
        return result;
    }
}
