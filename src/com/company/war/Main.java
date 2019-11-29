package com.company.war;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Folder root = new Folder("Root");
        Folder f1 = new Folder("Creation");
        Folder f2 = new Folder("Structure");
        Folder f3 = new Folder("Comportement");
        root.addComponent(f1);
        root.addComponent(f2);
        root.addComponent(f3);

        f1.addComponent(new File("Singleton"));
        f1.addComponent(new File("Builder"));

        f2.addComponent(new File("Composite"));
        f2.addComponent(new File("Decorator"));

        f3.addComponent(new File("Strategy"));
        f3.addComponent(new File("Adapter"));

        f1.addComponent(new Folder("St1"));
        Folder folder = (Folder) f1.getComponent("St1");
                folder.addComponent(new File("Singleton Version 2"));

        root.view();
    }
}
