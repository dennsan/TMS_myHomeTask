package org.tms.lessons26.observer;

import java.util.Observable;


public class Subscriber extends Observable{

    private String name;

    public Subscriber(String name) {
        this.name = name;
    }

    public void create(){
        setChanged();
        notifyObservers(this);
    }

    public String getName() {
        return name;
    }
}
