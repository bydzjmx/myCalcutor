package com.jmx.calculator.factory;

import com.jmx.calculator.base.BaseFactory;
import com.jmx.calculator.model.Operation;
import com.jmx.calculator.service.impl.AddServiceImpl;
import com.jmx.calculator.service.impl.DivServiceImpl;
import com.jmx.calculator.service.impl.MulServiceImpl;
import com.jmx.calculator.service.impl.SubServiceImpl;

/**
 * 工厂类，可以将判断放在工厂中进行，而非每次添加逻辑代码。做到判断和业务代码的解耦。代码更为简洁
 */
public class OperationFactory implements BaseFactory {
    public static Operation createOperation(String operation){
        Operation oper = null;
        switch (operation){
            case "add":
                oper =new AddServiceImpl();
                break;
            case "sub":
                oper =new SubServiceImpl();
                break;
            case "mul":
                oper =new MulServiceImpl();
                break;
            case "div":
                oper =new DivServiceImpl();
                break;
        }
        return oper;
    }
}
