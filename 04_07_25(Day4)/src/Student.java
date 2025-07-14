class Student {
    String name;

    // Constructor with same name as instance variable
    Student(String name) {
        this.name = name;  // 'this.name' refers to the instance variable
    }

    void display() {
        System.out.println("Student name: " + name);
    }
    public static void main(String[] args) {
        Student s = new Student("Priyank");
        s.display();
    }
}