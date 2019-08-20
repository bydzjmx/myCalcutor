package com.jmx.calculator.model;

import lombok.Data;

/**\
 * 基础操作类
 */
@Data
public class Operation {
    //定义两个操作数
    public Double numberA;
    public Double numberB;

    public Double getResult(){
        Double result = 0D;
        return result;
    }
}
