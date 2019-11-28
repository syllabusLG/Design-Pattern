package com.company.decorator;

import com.company.boisson.Boisson;

public class Caramel extends AbstractDecorator {
    public Caramel(Boisson boisson) {
        super(boisson);
    }

    @Override
    public String getDescription() {
        return boisson.getDescription()+" au caramel";
    }

    @Override
    public double cout() {
        return 0.9+boisson.cout();
    }
}
