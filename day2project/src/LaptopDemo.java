public class LaptopDemo {
    public static void main(String[] args) {
        Laptop l1=new Laptop();
        Laptop l2=new Laptop();
        l1.initialize(10,50,"HP",15.85);
        l2.initialize(40,80,"DELL",15.85);
        l1.display();
        l2.display();


    }
}
