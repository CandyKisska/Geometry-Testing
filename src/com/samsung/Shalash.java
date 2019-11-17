package com.samsung;

public class Shalash extends Home implements Building {
    public Shalash(String address, int floors) {
        super(address, floors);
    }

    @Override
    void build(int years) {
        System.out.println("Shalsh building for " + years + " years.");
    }

    @Override
    public void build() {

    }

    public void destroy() {

    }
}
