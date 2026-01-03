package DESIGNPATTERN.ObserverPattern.WeatherStation.Observer;

public class MobileDisplayObserver implements WeatherObserver{
    private final String ObserverId;

    public MobileDisplayObserver(String ObserverId){
        this.ObserverId = ObserverId;
    }

    public MobileDisplayObserver() {
        this.ObserverId = null;
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
