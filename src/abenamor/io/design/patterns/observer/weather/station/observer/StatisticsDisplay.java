package abenamor.io.design.patterns.observer.weather.station.observer;

import abenamor.io.design.patterns.observer.weather.station.subject.Subject;
import abenamor.io.design.patterns.observer.weather.station.subject.WeatherData;

public class StatisticsDisplay implements Observer, DisplayElement{
    private float temperature;
    private Subject subject;

    public StatisticsDisplay(Subject subject) {
        this.subject = subject;
        subject.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Statistics Display : temperature " + temperature );
    }

    @Override
    public void update() {
        if (this.subject instanceof WeatherData) {
            this.temperature = ((WeatherData) this.subject).getTemperature();
        }

        display();
    }
}
