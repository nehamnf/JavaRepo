package atmmachine;

public class AtmMain {
    public static void main(String[] args) {
        Atm at= new Atm();
        Customer c1= new Customer(at,"neha",200);
        Customer c2= new Customer(at,"Safi",500);
//        c1.start();
//        c2.start();

        c1.run();
        c2.run();
    }
}
