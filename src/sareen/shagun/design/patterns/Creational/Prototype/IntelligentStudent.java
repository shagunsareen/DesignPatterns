package sareen.shagun.design.patterns.Creational.Prototype;

public class IntelligentStudent extends Student {
    private int iq;

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    public IntelligentStudent() {
    }

    public IntelligentStudent(IntelligentStudent target) {
        super(target); //this will set parent class values
        this.iq = target.iq;
    }

    // this.name = target.name;    ---- since these variables are private they can't be accessed in child class
    // so we need super constructor to initialise parent class params

    @Override
    public Student copy() {
        return new IntelligentStudent(this);
    }

    @Override
    public String toString() {
        return "IntelligentStudent{" +
                super.toString() +
                ", iq=" + iq +
                '}';
    }
}
