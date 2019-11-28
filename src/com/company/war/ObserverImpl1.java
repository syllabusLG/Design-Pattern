package com.company.war;

public class ObserverImpl1 implements Observer{

    @Override
    public void update(Observable observable) {
        int state = ((ObservableImpl) observable).getState();
        double res = state * state +9;
        System.out.println("**********ObserverImpl1****************");
        System.out.println("Nouvelle mise à jour : state ="+state);
        System.out.println("Resultat de calcul :"+res);
        System.out.println("***************************************");
    }
}
