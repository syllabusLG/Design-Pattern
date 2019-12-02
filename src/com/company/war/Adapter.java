package com.company.war;

public class Adapter implements Standard {

    AncienneImpl ancienne = new AncienneImpl();

    @Override
    public void operation(int nbre1, int nbre2) {
        double res = ancienne.calcul(nbre1, nbre2);
        ancienne.print(res);
    }
}
