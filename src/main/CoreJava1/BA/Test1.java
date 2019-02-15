package BA;

import Five.Test;

public class Test1 <T> {

    private T fisrt;
    private T second;
    public Test1() {}
    public Test1(T fisrt, T second) {
        this.fisrt = fisrt;
        this.second = second;
    }

    public T ceshi1() {
        return fisrt;
    }



}
