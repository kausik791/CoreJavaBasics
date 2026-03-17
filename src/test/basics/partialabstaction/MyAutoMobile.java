package test.basics.partialabstaction;

public class MyAutoMobile {
    public static void main(String[] args) {
       // Engine engine = new V8Engine();
        Engine engine =new V8Engine(34000, 2021);
        engine.setMilesDriven(15000);//setter method is replacing the earlier value of milesDriven
        //engine.setManufactureYear(2020);

        engine.start();
        engine.accelerate();
        engine.stop();
        Engine.serviceEngine();
        V8Engine.serviceEngine();
        System.out.println("Miles Driven: " + engine.getMilesDriven());
        System.out.println("Manufacture Year: " + engine.manufactureYear);
        System.out.println("Engine Type: " + Engine.ENGINE_TYPE);
        System.out.println("Engine Type: " + V8Engine.ENGINE_TYPE);

    }
}
