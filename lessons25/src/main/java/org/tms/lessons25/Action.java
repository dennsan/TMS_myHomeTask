package org.tms.lessons25;

public class Action {

    private static Action action;

    private Action(String text) {
        System.out.println(text);
    }

    public static Action getInstance(String text) {
        if (action == null) {
            synchronized (Action.class) {
                if (action == null) {
                    action = new Action(text);
                }
            }
        }
        return action;
    }

}
