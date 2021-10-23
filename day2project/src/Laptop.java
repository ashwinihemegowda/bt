public class Laptop {
    private int RAM;
    private int HDD;
    private String processor;
    private double screenSize;
    public Laptop()
    {
        System.out.println("Inside Laptop Constructor");
    }
    public void initialize(int r,int h,String p,double s)
    {
        RAM=r;
        HDD=h;
        processor=p;
        screenSize=s;
    }
    public void display()
    {
        System.out.println("RAM is "+RAM+" GB");
        System.out.println("HDD is "+HDD+" GB" );
        System.out.println("This is "+processor+" processor");
        System.out.println("Screen size is : "+screenSize);
    }


}
