package DESIGNPATTERN.ObserverPattern.WeatherStation;

import DESIGNPATTERN.ObserverPattern.WeatherStation.Observable.WeatherStation;
import DESIGNPATTERN.ObserverPattern.WeatherStation.Observer.MobileDisplayObserver;
import DESIGNPATTERN.ObserverPattern.WeatherStation.Observer.TvDisplayObserver;

public class WeatherForcast {
    public static void main(String []args){
        WeatherStation weatherStation = new WeatherStation();

        TvDisplayObserver tvDisplayObserver = new TvDisplayObserver("TV0123");
        MobileDisplayObserver mobileDisplayObserver = new MobileDisplayObserver("MB987");

        weatherStation.addObserver(tvDisplayObserver);
        weatherStation.addObserver(mobileDisplayObserver);

        
        weatherStation.addWeatherReading(45.56f, 23.55f, 90.8f);

        weatherStation.removeObserver(tvDisplayObserver);

          weatherStation.addWeatherReading(40.9f, 11f, 20.7f);




    }
    
}
