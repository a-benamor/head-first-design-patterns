package abenamor.io.design.patterns.observer.weather.station.observer;

import abenamor.io.design.patterns.observer.weather.station.subject.Subject;
import abenamor.io.design.patterns.observer.weather.station.subject.WeatherData;

public class CurrentConditionDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature + " F degrees and " + humidity + "% humidity");
    }

    @Override
    public void update() {
        if (this.weatherData instanceof WeatherData){
            this.temperature = ((WeatherData) weatherData).getTemperature();
            this.humidity = ((WeatherData) weatherData).getHumidity();
            display();
        }

    }
}
