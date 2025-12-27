package SOLID.ISP.Follow;

public class ISPFollow {

    public static void main(String []args){
        Waiter waiter = new Waiter();
        waiter.serveFood();
        waiter.takeOrder();

        Cheif cheif = new Cheif();
        cheif.cookFood();
        cheif.decideMenue();
    }
    
}
