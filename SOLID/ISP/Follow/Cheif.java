package SOLID.ISP.Follow;

public class Cheif implements CheifTask {
    
    @Override
    public void cookFood(){
        System.out.println("chief cooking food");
    }

    @Override
    public void decideMenue(){
        System.out.println("chief decides menue");
    }

    
}
