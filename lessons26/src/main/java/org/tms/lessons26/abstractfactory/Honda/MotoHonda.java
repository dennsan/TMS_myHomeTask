package org.tms.lessons26.abstractfactory.Honda;

import org.tms.lessons26.abstractfactory.Moto;

public class MotoHonda implements Moto {
    @Override
    public void buildMoto() {
        System.out.println("Build moto Honda");
    }
}
