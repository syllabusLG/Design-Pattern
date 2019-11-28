package com.company;

import com.company.boisson.Boisson;
import com.company.boisson.Expresso;
import com.company.decorator.Caramel;
import com.company.decorator.Chocolat;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Boisson boisson = new Expresso();
        System.out.println("------------------------");
        System.out.println(boisson.getDescription());
        System.out.println(boisson.cout());
        System.out.println("------------------------");
        boisson = new Chocolat(boisson);

        System.out.println(boisson.getDescription());
        System.out.println(boisson.cout());
        System.out.println("------------------------");
        boisson = new Caramel(boisson);

        System.out.println(boisson.getDescription());
        System.out.println(boisson.cout());
        System.out.println("------------------------");
    }
}
