package atmmachine;

public class Atm {

    public synchronized void checkBalance(String  name){
        System.out.print(name+" is Checking ");
        try {
            Thread.sleep(1000);
        }catch (InterruptedException e){
            System.out.println(e);
        }
        System.out.println("Balance");
    }

    public synchronized void withdrawAmount(String name,int amount){
        System.out.print(name +" is Withdrawing Amount ");
        try {
            Thread.sleep(1000);
        }catch (InterruptedException e){
            System.out.println(e);
        }
        System.out.println(amount);
    }
}
