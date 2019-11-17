package com.samsung;

public class Panel extends Home {
    public Panel(String address, int floors) {
        super(address, floors);
    }

    @Override
    void build(int years) {
        System.out.println("Panelka building for " + years + " years.");
    }
}
