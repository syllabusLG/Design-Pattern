package com.company.war;

public interface Observable {
    //add observer
    public void subscribe(com.company.war.Observer observer);
    //remove observer
    public void unsubscribe(Observer observer);
    //notify observers
    public void notifyObservers();
}
