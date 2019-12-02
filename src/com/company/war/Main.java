package com.company.war;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Client client = new Client();
        client.setStandard(new StandardImpl1());
        client.process(4,5);
        client.setStandard(new StandardImpl2());
        client.process(4,5);
        client.setStandard(new Adapter());
        client.process(4,5);
    }
}
