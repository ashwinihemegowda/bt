public class Program001 {
    private int length;
    private int width;
    private int height;
    public int getLength()
    {
        return length;
    }
    public int getWidth()
    {
        return width;
    }
    public int getHeight()
    {
        return height;
    }
    public void setLength(int length)
    {
        this.length=length;
    }
    public void setWidth(int width)
    {
        this.width=width;
    }
    public void setHeight(int height)
    {
        this.height=height;
    }
    public Program001(int length, int width,int height)
    {
        this.length=length;
        this.width=width;
        this.height=height;
    }
    public void display()
    {
        System.out.println("length="+length);
        System.out.println("width="+width);
        System.out.println("height="+height);
    }
    public int get_volume()
    {
        return length*width*height;
    }
}
