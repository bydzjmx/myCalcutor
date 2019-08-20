package com.jmx.calculator.controller;

import com.jmx.calculator.factory.OperationFactory;
import com.jmx.calculator.model.Operation;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class OperationController {

    //跳转到计算
    @RequestMapping("/cal")
    public String operation(Model model, @RequestParam("a") Double numberA,@RequestParam("b") Double numberB,
                            @RequestParam("operation")String operation){
        Operation oper;
        oper = OperationFactory.createOperation(operation);
        oper.setNumberA(numberA);
        oper.setNumberB(numberB);
        model.addAttribute("result",oper.getResult());
        return "cal";
    }
}
