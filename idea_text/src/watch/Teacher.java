package watch;

public abstract class Teacher extends People {
    public Teacher() {

    }
    public Teacher(String name, int age) {
        super(name, age);
    }
    public abstract void teach();
}
