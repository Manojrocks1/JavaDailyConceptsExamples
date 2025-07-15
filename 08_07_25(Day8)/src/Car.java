public class Car {
    String brand;

    Car(String brand) {
        this.brand = brand;  // this.brand refers to instance variable
    }

    void showBrand() {
        System.out.println("Brand: " + this.brand);
    }
}
