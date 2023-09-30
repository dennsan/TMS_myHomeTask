package org.tms.lessons26.observer;

import java.util.Observable;
import java.util.Observer;

public class PublisherService implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        if(arg instanceof Subscriber){
           var subscriber = (Subscriber)arg;
            System.out.println("Create publisher " + subscriber.getName());
        }
    }
}
