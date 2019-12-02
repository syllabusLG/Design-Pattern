package com.company.war;

public class AncienneImpl {

    public double calcul(double nbr1, int nbre2){
        return  2*nbr1+nbre2;
    }
    public void print(double nb){
        System.out.println("---------------------------");
        System.out.println("Ancienne implementation");
        System.out.println(nb);
        System.out.println("---------------------------");
    }
}
