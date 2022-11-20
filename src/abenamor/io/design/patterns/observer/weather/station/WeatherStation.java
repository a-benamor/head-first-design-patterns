package abenamor.io.design.patterns.observer.weather.station;

import abenamor.io.design.patterns.observer.weather.station.observer.CurrentConditionDisplay;
import abenamor.io.design.patterns.observer.weather.station.observer.ForecastDisplay;
import abenamor.io.design.patterns.observer.weather.station.observer.StatisticsDisplay;
import abenamor.io.design.patterns.observer.weather.station.subject.WeatherData;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);

        weatherData.setMeasurements(80,65,30.4f);
        System.out.println("---------------------------------------------");
        weatherData.setMeasurements(82,70,29.2f);
        System.out.println("---------------------------------------------");
        weatherData.setMeasurements(78,90,29.2f);
    }
}
