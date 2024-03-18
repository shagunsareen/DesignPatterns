package sareen.shagun.design.patterns.Creational.Builder;

public class Client {
    public static void main(String[] args) throws Exception {

        Student s1 = Student.getBuilder().setAge(12).setfName("Shagun").setGender("Female").build();
        System.out.println(s1.toString());
    }
}
