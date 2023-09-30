package org.tms.lessons26.abstractfactory.Toyota;

import org.tms.lessons26.abstractfactory.Moto;

public class MotoToyota implements Moto {
    @Override
    public void buildMoto() {
        System.out.println("Build moto Toyota");
    }
}
