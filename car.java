class car {
    private int topSpeed;
    private String name;
    public car(int topSpeed, String name) {
        this.topSpeed = topSpeed;
        this.name = name;
    }
    public String toString() {
        return "car[name=" + name + ", topSpeed=" + topSpeed + " km/h]";
    }
    public static void main(String[] args) {
        car car1 = new car(180, "Toyota");
        car car2 = new car(220, "BMW");
        car car3 = new car(250, "Mercedes");
        car car4 = new car(200, "Audi");
        car car5 = new car(240, "Lamborghini");

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);
        System.out.println(car5);
    }
}