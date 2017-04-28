package com.abstractfactory;

import java.math.BigDecimal;

/**
 * Created by prengifo on 4/28/17.
 */
public interface IFactory {
    BigDecimal getObject(String input);
}
