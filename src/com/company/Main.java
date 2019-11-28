package com.company;

import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception{
	// write your code here
        Context context = new Context();
        boolean end = false;
        Scanner scanner = new Scanner(System.in);
        while (!end){
            System.out.println("Donner la strategie :");
            String strategyClassName = scanner.nextLine();
            IStrategy strategy = (IStrategy) Class.forName(strategyClassName).newInstance();
            context.setiStrategy(strategy);
            System.out.println("------------------------");
            context.process();
        }



    }
}
