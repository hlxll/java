package watch;

public abstract class People {
    private String name;
    private int age;

    public People() {

    }
    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {return this.name;}
    public void setName(String name) {this.name = name;}
    public int getAge() {return this.age;}
    public void setAge(int age) {this.age = age;}
    public abstract void eat();
}
