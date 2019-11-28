package com.company;

import java.time.chrono.IsoChronology;

public class Context {

    private IStrategy iStrategy;

    public Context() {
        this.iStrategy = new DefaultStrategyImpl();
    }

    public void process(){
        System.out.println("Version initiale...");
        iStrategy.applyStrategy();
        System.out.println("Version finale...");
    }

    public void setiStrategy(IStrategy iStrategy) {
        this.iStrategy = iStrategy;
    }
}
