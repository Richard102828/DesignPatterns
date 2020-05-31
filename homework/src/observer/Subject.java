package observer;

import java.util.Vector;

public abstract class Subject {

    private Vector<Observer> mObservers = new Vector<>();

    public void addObserver(Observer observer) {
        mObservers.add(observer);
    }

    public void removeObserver(Observer observer) {
        mObservers.remove(observer);
    }

    public void notifyObservers() {
        for (Observer o : mObservers) {
            o.update();
        }
    }

    public abstract void doSomething();
}
