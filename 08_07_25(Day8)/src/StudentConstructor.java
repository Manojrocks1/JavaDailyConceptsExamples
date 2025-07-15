public class StudentConstructor {
    String name;
    int age;

    StudentConstructor(String n, int a){
        name = n;
        age = a;
    }

    public StudentConstructor(String string) {
        
    }

    void display(){
        System.out.println(name + " is " + age + " years old.");
    }

    public void showBrand() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'showBrand'");
    }
}
