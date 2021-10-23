public class Car {
    private String fuelType;
    private int engineCapacity;
    private float power;
    private int noOfGears;
    private String name;
    private Tyre tyre;
    private MusicSystem mus;

    public Car(String fuelType, int engineCapacity, float power, int noOfGears, String name) {
        this.fuelType = fuelType;
        this.engineCapacity = engineCapacity;
        this.power = power;
        this.noOfGears = noOfGears;
        this.name = name;

    }

    public String getFuelType() {
        return fuelType;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public float getPower() {
        return power;
    }

    public int getNoOfGears() {
        return noOfGears;
    }

    public String getName() {
        return name;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public void setEngineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public void setPower(float power) {
        this.power = power;
    }

    public void setNoOfGears(int noOfGears) {
        this.noOfGears = noOfGears;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Tyre getTyre() {
        return tyre;
    }

    public void setTyre(Tyre tyre) {
        this.tyre = tyre;
    }

    public MusicSystem getMus() {
        return mus;
    }

    public void setMus(MusicSystem mus) {
        this.mus = mus;
    }

    public void accelerate()
    {
        System.out.println(name+" Car is accelerating...");
    }
    public void applyBrake()
    {
        System.out.println(name+" Car is slowing|stopping");
    }
    public void  changeGear(int gear)
    {
        if(gear<0||gear>noOfGears)
            System.out.println("Wrong gear selected!!!");
        else
        System.out.println(name+" Car is changing gear no."+gear);
    }
    public void steer()
    {
        System.out.println(name+" Car is changing directions");
    }
    public void displayFeatures()
    {
        System.out.println("features of "+name+" Car");
        System.out.println("-------------------------");
        System.out.println("Engine capacity: "+engineCapacity);
        System.out.println("Fuel type : "+fuelType);
        System.out.println("Power : "+power);
        System.out.println("No of gears : "+noOfGears);
        System.out.println("Tyre name-->"+tyre.getTyreName()+" Tyre Size-->"+tyre.getTyreSize());
        System.out.println("Music System Name-->"+mus.getName()+" ,No. of speakers-->"+mus.getNoOfSpeakers()+
                " ,Sub woofer-->"+mus.isSubWoofer()+" ,LCD screen size-->"+mus.getLcdScreenSize());
        System.out.println();
    }
}
