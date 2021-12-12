package netWork;

public class TreeBase implements Comparable<TreeBase> {
    private String name;
    private Integer pass;
    public TreeBase(String name, Integer pass){
        this.name = name;
        this.pass = pass;
    }

    public Integer getPass(){
        return this.pass;
    }
    @Override
    public int compareTo(TreeBase s) {
        int num = this.pass - s.pass;
        num = num==0?this.name.compareTo(s.name):num;
        return num;
    }
}
