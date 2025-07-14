class School {
    static String schoolName = "Greenwood High";

    static void announce() {
        System.out.println("Welcome to " + schoolName);
    }

public class Main {
    public static void main(String[] args) {
        School.announce(); // No object needed
    }
}
}