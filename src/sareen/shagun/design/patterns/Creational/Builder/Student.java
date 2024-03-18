package sareen.shagun.design.patterns.Creational.Builder;

public class Student {
    private int age;
    private String fName;
    private String lName;
    private String gender;
    private double psp;
    private double weight;

    public static Builder getBuilder(){
        return new Builder();
    }
    private Student(Builder b) {  //if this constructor is kept public then we can set it as null
        this.age = b.getAge();
        this.fName = b.getfName();
        this.lName = b.getlName();
        this.gender = b.getGender();
        this.psp = b.getPsp();
        this.weight = b.getWeight();
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                ", gender='" + gender + '\'' +
                ", psp=" + psp +
                ", weight=" + weight +
                '}';
    }

    static class Builder {
        private int age;
        private String fName;
        private String lName;
        private String gender;
        private double psp;
        private double weight;

        public int getAge() {
            return age;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public String getfName() {
            return fName;
        }

        public Builder setfName(String fName) {
            this.fName = fName;
            return this;
        }

        public String getlName() {
            return lName;
        }

        public Builder setlName(String lName) {
            this.lName = lName;
            return this;
        }

        public String getGender() {
            return gender;
        }

        public Builder setGender(String gender) {
            this.gender = gender;
            return this;
        }

        public double getPsp() {
            return psp;
        }

        public Builder setPsp(double psp) {
            this.psp = psp;
            return this;
        }

        public double getWeight() {
            return weight;
        }

        public Builder setWeight(double weight) {
            this.weight = weight;
            return this;
        }

        private boolean validate(){
            return true;
        }

        public Student build() throws Exception {
            if(!validate()){
                throw new Exception();
            }
            return new Student(this);
            //since student constructor is private and we want to access it here we have made builder class as inner class
            //otherwise we won't be able to access the constructor
        }
    }
}
