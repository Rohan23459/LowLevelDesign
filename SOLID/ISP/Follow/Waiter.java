package SOLID.ISP.Follow;

public class Waiter implements WaiterTask{

    @Override

    public void takeOrder(){
        System.out.println("waiter taking order");
    }
    
    @Override
    public void serveFood(){
        System.out.println("waiter serving food");
    }
    
}
