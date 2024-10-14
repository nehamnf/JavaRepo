package atmmachine;

public class Customer extends Thread{
    private Atm atm;
    private String name;
    private int amount;

    Customer(Atm atm,String name,int amount){
        this.atm=atm;
        this.name= name;
        this.amount= amount;
    }
    @Override
    public void run(){
        atm.checkBalance(name);
        atm.withdrawAmount(name,amount);
    }
}
