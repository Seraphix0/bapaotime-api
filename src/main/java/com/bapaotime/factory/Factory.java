package com.bapaotime.factory;

public class Factory {
    private static Factory instance = new Factory();

    private Factory() {
    }

    public static Factory getInstance() {
        return instance;
    }


}
