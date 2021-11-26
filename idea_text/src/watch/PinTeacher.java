package watch;

public class PinTeacher extends Teacher implements Speak{
    public PinTeacher() {}

    public PinTeacher(String name, int age) {
        super(name, age);
    }
    @Override
    public void teach() {
        System.out.println("乒乓球教练教你透露");
    }

    @Override
    public void eat() {
        System.out.println("乒乓球教练吃羊肉");
    }

    @Override
    public void SpeakEnglish() {

    }
    Teacher a = new PinTeacher();
}
