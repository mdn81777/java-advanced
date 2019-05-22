package entity;

import DAO.Subject;

public class RealSubject implements Subject {
    @Override
    public void buyMac() {
        System.out.println("买一台MAC");
    }
}
