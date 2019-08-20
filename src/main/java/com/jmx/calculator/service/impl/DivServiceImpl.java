package com.jmx.calculator.service.impl;

import com.jmx.calculator.model.Operation;
import com.jmx.calculator.service.DivService;

public class DivServiceImpl extends Operation implements DivService {
    @Override
    public Double getResult() {
        Double result = 0D;
        if(numberB==0){
            throw new RuntimeException("除数不能为0");
        }
        result = numberA/numberB;
        return result;
    }
}
