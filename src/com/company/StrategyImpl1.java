package com.company;

public class StrategyImpl1 implements IStrategy {
    @Override
    public void applyStrategy() {
        System.out.println("Etape intermediaire de l'algo avec la strategie 1");
    }
}
