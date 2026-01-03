package DESIGNPATTERN.ObserverPattern.WeatherStation.Observer;

public class TvDisplayObserver implements WeatherObserver {
    private final String ObserverId;

    public TvDisplayObserver(String observerId){
        this.ObserverId = observerId;
    }
    


    @Override
    public void update(){
        System.out.println("geting weather update on" + ObserverId);
    }

        @Override
        public String getUserId(){
            return this.ObserverId;
        }
    
}
