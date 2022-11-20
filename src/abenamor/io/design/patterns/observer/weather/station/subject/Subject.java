package abenamor.io.design.patterns.observer.weather.station.subject;

import abenamor.io.design.patterns.observer.weather.station.observer.Observer;

public interface Subject {
    public void registerObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObservers();
}
