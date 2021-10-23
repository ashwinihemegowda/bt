public class Program0001Demo {
    public static void main(String[] args) {
        Program001 p1=new Program001(100,50,200);
        p1.display();
        System.out.println("Volume of p1 is : "+p1.get_volume());
        p1.setLength(p1.getLength()*110/100);
        p1.setWidth(p1.getWidth()*120/100);
        p1.setHeight(p1.getHeight()*108/100);
        p1.display();
        System.out.println("Updated Volume of p1 is : "+p1.get_volume());
    }
}
