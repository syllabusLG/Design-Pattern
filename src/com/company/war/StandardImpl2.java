package com.company.war;

public class StandardImpl2 implements Standard {
    @Override
    public void operation(int nbre1, int nbre2) {
        double res = nbre1 + nbre2;
        System.out.println("------------------------");
        System.out.println("Implementation standard 2");
        System.out.println("-----Resultat: "+ res);
        System.out.println("------------------------");
    }
}
