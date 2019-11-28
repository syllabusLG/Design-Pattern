package com.company.war;

public abstract class Component {

    protected String name;
    private int level;

    public Component(String name) {
        this.name = name;
    }

    public abstract void view();
}
