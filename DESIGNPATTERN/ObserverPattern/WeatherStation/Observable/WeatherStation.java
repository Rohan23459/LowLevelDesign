package DESIGNPATTERN.ObserverPattern.WeatherStation.Observable;

import DESIGNPATTERN.ObserverPattern.WeatherStation.Observer.WeatherObserver;
import java.util.ArrayList;
import java.util.List;


public class WeatherStation implements WeatherObservable{
    private List<WeatherObserver>weatherObservers;
    private float Temprature;
    private float Humidity;
    private float Pressure;


    public WeatherStation(){
        this.weatherObservers = new ArrayList<>();
    }

    @Override
        public void addObserver(WeatherObserver observer){
            System.out.println(observer.getUserId() + " wether observer is addig...");
            weatherObservers.add(observer);

        }

    @Override
        public void removeObserver(WeatherObserver observer){
            System.out.println(observer.getUserId()+ " weather observer is removed ...");
            weatherObservers.remove(observer);
        }

    @Override
        public void notifyObserver(){
           
            for (WeatherObserver observer : weatherObservers){
                observer.update();
                 System.out.println("notifying " + observer.getUserId()+" registered user about current weather status");
            }
        }

    @Override
        public void addWeatherReading(float temp , float humidity , float pressure){
            this.Humidity = humidity;
            this.Temprature = temp;
            this.Pressure = pressure;
            notifyObserver();
            
        }

    public float getTempratue(){
        return this.Temprature;
    }

    public float getHumidity(){
        return this.Humidity;
    }

    public float getPressure(){
        return this.Pressure;
    }

   

    
}
