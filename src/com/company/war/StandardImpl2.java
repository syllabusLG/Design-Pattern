package com.company.war;

public class StandardImpl1 implements Standard {
    @Override
    public void operation(int nbre1, int nbre2) {
        double res = nbre1 * nbre2;
        System.out.println("------------------------");
        System.out.println("-----Resultat: "+ res);
        System.out.println("------------------------");
    }
}