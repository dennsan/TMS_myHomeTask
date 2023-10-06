package org.tms.lessons26.observer;

public class MainApp {
    public static void main(String[] args) {
        Subscriber subscriber = new Subscriber("subscriber");
        PublisherService publisherService = new PublisherService();
        CreatorService creatorService = new CreatorService();
        subscriber.addObserver(publisherService);
        subscriber.addObserver(creatorService);
        subscriber.create();
    }
}
