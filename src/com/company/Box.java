package com.company;

public class Box <T>{
    T var;

    public Box(T var) {
        this.var = var;
    }

    public T getVar() {
        return var;
    }

    public void setVar(T var) {
        this.var = var;
    }

    @Override
    public String toString() {
        return "Box{" +
                "var=" + var +
                '}';
    }
    public static Class<Box>  a(){

        return Box.class;
    }
}
