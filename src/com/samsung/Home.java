package com.samsung;

public abstract class Home {
    String address;
    int floors;

    public Home(String address, int floors) {
        this.address = address;
        this.floors = floors;
    }

    abstract void build(int years);

}
