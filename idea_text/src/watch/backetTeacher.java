package watch;

public class backetTeacher extends Teacher implements Speak{

    public backetTeacher() {}

    public backetTeacher(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println("篮球教练教你透露");
    }

    @Override
    public void eat() {
        System.out.println("篮球教练吃羊肉");
    }

    @Override
    public void SpeakEnglish() {

    }
}
