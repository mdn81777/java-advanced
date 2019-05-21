package test;

import entity.Singleton;

public class SingletonTest {
    public static void main(String[] args) {
        Singleton object = Singleton.getInstance();
        object.showMessage();
    }
}
