class Car extends Vehicle {
    public Car(String make, String model) {
        super(make, model);
    }

    @Override
    public String start(int n) {
        System.out.println(" In Car ---> Car started with the speed " + n);
        return super.start(n);
    }
    public String navigation(){
        System.out.println(" Navigation is ON");
        return null;
    }
}

