package top.zz.stepapp;

import java.util.Observable;

public class StepCounterObservable extends Observable {

    public void sendChange(float progress) {
        setChanged();
        notifyObservers(progress);
    }
}