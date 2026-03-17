package test.basics.partialabstaction;

public abstract class Engine {

    int milesDriven;
    int manufactureYear;
    static String ENGINE_TYPE = "V8";

    public Engine() {

    }

    public abstract void start();
    public abstract void stop();
    public static void serviceEngine(){
        System.out.println("Engine is being serviced");
    }
   public void accelerate(){
        System.out.println("Engine is accelerating");
    }
    public Engine(int milesDriven, int manufactureYear) {
        this.milesDriven = milesDriven;
        this.manufactureYear = manufactureYear;
    }

    public int getMilesDriven() {
        return milesDriven;
    }

    public int getManufactureYear() {
        return manufactureYear;
    }

    public void setManufactureYear(int manufactureYear) {
        this.manufactureYear = manufactureYear;
    }

    public void setMilesDriven(int milesDriven) {
        this.milesDriven = milesDriven;
    }
}
