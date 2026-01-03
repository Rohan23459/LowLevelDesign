package DESIGNPATTERN.ObserverPattern.NotifyMe.Observer;

public class EmailNotificationObserver implements StockNotificationObserver{

    private final String userID;
    private final String EmailID;

    public EmailNotificationObserver(String userId , String emailId) {
        this.userID = userId;
        this.EmailID = emailId;
    }

    @Override

        public void update(){
            sendMessege();

        };

        public void sendMessege(){
            System.out.println("!! EMAIL SENT to: " + EmailID + " - " + "Product is back in stock! Hurry Up!!");
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
