class Printer {
    void print(String msg) {
        System.out.println(msg);
    }

    void print(int number) {
        System.out.println("Number: " + number);
    }
}

public class Main {
    public static void main(String[] args) {
        Printer p = new Printer();
        p.print("Hello");
        p.print(100);
    }
}