package com.company;

public class DefaultStrategyImpl implements IStrategy {
    @Override
    public void applyStrategy() {
        System.out.println("Etape intermediaire de l'algo avec la strategie par defaut");
    }
}
