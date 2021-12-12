package netWork.file;

import java.io.File;
import java.io.IOException;

public class FileSet {
    public static void main(String[] args) throws IOException {
        File file = new File("E:\\own\\java\\idea_text");
        iteratorFile(file);
    }
    public static void FileMethod(){
        //参数路径不存在不报错，只是抽象路径
        File file1 = new File("E:\\own");

        File file2 = new File("E:\\own", "code");

        File file3 = new File("E:\\own");
        File file4 = new File(file3, "code");
        System.out.println(file4);
    }
    public static void CreateFile() throws IOException {
        File file = new File("E:\\own\\java\\idea_text\\java.txt");
        //如果抽象路径存在，就返回false，如果不存在就创建该文件
//        file.createNewFile();

        //如果目录不存在就创建目录，返回true。如果存在就返回false
        File file1 = new File("E:\\own\\java\\idea_text\\java");
//        file1.mkdir();

        //创建多级目录
        File file2 = new File("E:\\own\\java\\idea_text\\java\\java");
//        file2.mkdirs();

        //创建文件，如果有目录名和他一样，也是不能创建成功的
        File file3 = new File("E:\\own\\java\\idea_text\\javase.txt");
        file3.createNewFile();

        System.out.println(file3.equals(file2));
    }

    //递归遍历文件目录的所有文件
    public static void iteratorFile(File srcFile) {
        File[] fileArray = srcFile.listFiles();
        if(fileArray != null){
            for (File file:fileArray){
                if(file.isDirectory()){
                    iteratorFile(file);
                }else{
                    System.out.println(file.getAbsolutePath());
                }
            }
        }
    }
}
