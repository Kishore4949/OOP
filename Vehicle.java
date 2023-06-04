public class Vehicle {
    private String make;
    private String model;

    public Vehicle(String make, String model){
        this.make=make;
        this.model=model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model=model;
    }
    public void setMake(String make) {
        this.make=make;
    }
    public String getMake() {
        return make;
    }
    public String start(int n){

        return "Stated";
    }
    public boolean stop(){
        System.out.println("Stoped");
        return false;
    }
    public static void main(String args[]) {
        Car car = new Car("BMW", "X6");
        Cycle cycle= new Cycle("Hero", "f4");
        System.out.println(cycle.start(0));
        System.out.println(car.stop());

        System.out.println(car.start(50));
        System.out.println(car.navigation());
        System.out.println(cycle.toMusic());



    }



}
