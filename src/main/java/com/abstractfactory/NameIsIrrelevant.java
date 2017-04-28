package com.abstractfactory;

import java.math.BigDecimal;

/**
 * Created by prengifo on 4/28/17.
 */
public class NameIsIrrelevant {

    public IFactory instance() {
        return input -> new BigDecimal(input);
    }
}