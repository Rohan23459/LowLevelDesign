package DESIGNPATTERN.ObserverPattern.WeatherStation.Observable;
import DESIGNPATTERN.ObserverPattern.WeatherStation.Observer.WeatherObserver;
public interface WeatherObservable {
    void addObserver(WeatherObserver observer);
    void removeObserver(WeatherObserver observer);
    void notifyObserver();
    void addWeatherReading(float temp, float humidity, float pressure);  
}
