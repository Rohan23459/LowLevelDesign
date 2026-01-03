package DESIGNPATTERN.ObserverPattern.NotifyMe.Observer;

public class MessegeNotificationObserver implements StockNotificationObserver{

    private final String userID;
    private final String MobileNumber;

    public MessegeNotificationObserver(String userId , String mobNo) {
        this.userID = userId;
        this.MobileNumber = mobNo;
    }

    @Override

        public void update(){
            sendMessege();

        };

        public void sendMessege(){
            System.out.println("!! MESSEGE SENT to: " + MobileNumber + " - " + "Product is back in stock! Hurry Up!!");
        }
    @Override
        public String getNotificationMethod(){
            return "Mobile Messege";
        };
    @Override
        public String getUserID(){
            return userID;

        };


    
    
}
