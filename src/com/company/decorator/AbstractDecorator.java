package com.company.decorator;

import com.company.boisson.Boisson;

public abstract class AbstractDecorator extends Boisson{
    protected Boisson boisson;

    public AbstractDecorator(Boisson boisson) {
        this.boisson = boisson;
    }
    public abstract String getDescription();
}
