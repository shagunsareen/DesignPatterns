package sareen.shagun.design.patterns.Creational.Prototype;

public class Client {
    public static void main(String[] args) {
        Student st1 = new Student();
        st1.setAge(12);
        st1.setGender("Male");
        st1.setName("KL Rahul");

        Student st2 = st1.copy();
        Student st3 = new IntelligentStudent();
        st3.setName("IntelligentStudent");
        Student st4 = st3.copy();

        System.out.println("Student and Student copy " + st1.equals(st2));
        System.out.println("Intelligent Student and it's copy " + st3.equals(st4));
        System.out.println("1 - " + st1.toString());
        System.out.println("2 - " + st2.toString());
        System.out.println("3 - " + st3.toString());
        System.out.println("4 - " + st4.toString());
    }
}
