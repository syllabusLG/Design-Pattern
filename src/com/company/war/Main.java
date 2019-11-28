package com.company.war;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ObservableImpl observable = new ObservableImpl();
        Observer observer1 = new ObserverImpl1();
        Observer observer2 = new ObserverImpl2();
        Observer observer3 = new ObserverImpl1();

        observable.subscribe(observer1);
        observable.subscribe(observer2);
        observable.subscribe(observer3);

        observable.setState(55);
        observable.setState(30);
        observable.unsubscribe(observer1);

        //java7
        observable.subscribe(new Observer() {
            @Override
            public void update(Observable observable) {
                System.out.println("Observateur anonyme java 7 ===>"+ ((ObservableImpl)observable).getState());
            }
        });
        //java( expression lambda
        observable.subscribe(obs->{
            System.out.println("Observateur anonyme java 8===>"+((ObservableImpl)obs).getState());
        });
        observable.subscribe(observable1 -> System.out.println("Observateur anonyme gen===>"+((ObservableImpl)observable1 ).getState()));
        observable.setState(33);


    }
}
