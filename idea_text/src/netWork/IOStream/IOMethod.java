package netWork.IOStream;

import com.login.Student;

import java.io.*;
import java.util.Arrays;
import java.util.Properties;
import java.util.Set;

public class IOMethod {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        propertiesStream();
    }

    //字节流
    public static void outPutFile() {
        //创建字节输出流对象：1：调用系统功能创建文件 2：创建字节输出流对象 3：让字节输出流对象指向创建好的文件. 路径使用该类的相对路径
        //第二个参数是true就是追加
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("idea_text\\output.txt", true);

            //write将指定字节写入文件,写入的转为Scroll码
            fos.write("\r\n".getBytes());
            byte[] bys = {97, 98, 99};
            byte[] bys2 = "abcde".getBytes();
            fos.write(bys2, 1, 2);
            //写入数据换行: 1:写入换行字节符，window是\r\n,linux是\n,max是\r
            fos.write("\r\n".getBytes());
            fos.write(bys2, 1, 2);
            //最后释放资源，关闭此输出流并释放与此流相关联的任何系统资源
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            //finally是最后一定会执行的部分,如果上面的创建失败，fos就是null，那么清空就会报错
            if(fos != null){
                try {
                    fos.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }

        }
    }

    public static void intPutFile() throws IOException{
        FileInputStream file = new FileInputStream("idea_text\\output.txt");
        //read是一个一个字节读，使用(char)转换字节为字符
        //标准读取流，如果不使用int by，直接使用file.read和-1判断，会出错while(file.read() != -1)

//        FileOutputStream fs = new FileOutputStream("idea_text\\input.txt");
//        int by;
//        while((by = file.read()) != -1){
//            fs.write(by);
//            System.out.println((char)by);
//        }

        //读取多个字节的数组数据,返回读取到的数据长度,new String将字节数组转换为字符串
        byte[] bytArr = new byte[5];
        int len = file.read(bytArr);
        System.out.println(new String(bytArr, 0, len));

        file.close();
    }

    //复制图片，最快的方法是缓冲区加一次读写字节数组
    public static void copyImg() {
        BufferedInputStream bofile = null;
        BufferedOutputStream bofs = null;
        try{
            //缓冲类第二个参数是一次读取的长度，指定缓冲区大小
            FileInputStream file = new FileInputStream("idea_text\\static\\image\\1.jpg");
            bofile = new BufferedInputStream(file);

            FileOutputStream fs = new FileOutputStream("idea_text\\static\\image\\2.jpg");
            //设置输出缓冲流
            bofs = new BufferedOutputStream(fs);

            int by;
            byte[] byteLen = new byte[5];
            while((by = bofile.read(byteLen)) != -1){
                //复制文件，一次读多少，对应的就写入多少字节
                bofs.write(byteLen, 0, by);
            }
        }catch(IOException e){
            e.printStackTrace();
        } finally {
            if(bofs!=null){
                try{
                    bofs.close();
                }catch(IOException o){
                    o.printStackTrace();
                }
            }
            if(bofile!=null){
                try{
                    bofile.close();
                }catch(IOException o){
                    o.printStackTrace();
                }
            }
        }
    }

    //字符流
    public static void StringList() throws IOException {
        String s = "123";
        byte[] bys = s.getBytes("GBK");
        System.out.println(Arrays.toString(bys));

        String ss = new String(bys, "GBK");
        System.out.println(ss);



        //读取字节，使用指定编码，将写入的字符转换为字节
        FileOutputStream fos = new FileOutputStream("idea_text\\output.txt");
        OutputStreamWriter osWriter = new OutputStreamWriter(fos);

        //读取字节，使用指定编码，转换为字符
//        FileInputStream file = new FileInputStream("idea_text\\input.txt");
//        InputStreamReader isReader = new InputStreamReader(file);
        FileReader isReader = new FileReader("idea_text\\input.txt");
        int str = isReader.read();
        while(str != -1){
            osWriter.write(str);
            str = isReader.read();
        }
        osWriter.close();
        isReader.close();

        BufferedWriter bufWrite = new BufferedWriter(new FileWriter("idea_text\\output.txt"));
        bufWrite.newLine();
        bufWrite.close();
    }
    public static void ReadStream() throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String line = br.readLine();

//        打印流
        PrintWriter pw = new PrintWriter(new FileWriter("idea_text\\input.txt"), true);
        pw.println("hello");
        pw.close();
    }

    //对象序列化流之后，修改对象类文件（student），再读取文件，会报错
//    1：类的串行版本与从流中读取的类描述符的类型不匹配
//    2：该类包含未知的数据类型
//    3：该类没有可访问的无参数构造函数
    //

    //对象序列化流
    public static void ObjectOutStream() throws IOException {
        //objectOutputStream   创建一个指定的outputStream的objectOutputStream.序列化流
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("idea_text\\input.txt"));
        //这个student需要实现Serializable
        Student s = new Student("huanglin", "123");
        oos.writeObject(s);
        oos.close();
    }
    //对象反序列化流
    public static void ObjectInStream() throws IOException, ClassNotFoundException {
        ObjectInputStream oos = new ObjectInputStream(new FileInputStream("idea_text\\input.txt"));
        Object obj = oos.readObject();
        Student s = (Student) obj;
        System.out.println(s.GetAddress());
        oos.close();
    }

    //map集合类，可以在序列化流中使用
    public static void propertiesStream() throws IOException {
        Properties prop = new Properties();

        prop.setProperty("item1", "huanglin");
        Set<Object> keyObj = prop.keySet();
        for(Object key:keyObj){
            Object value = prop.get(key);
            System.out.println(key+ " " + value);
        }
        //store和load是序列化和文件流结合，store将map集合类写入文件，load将文件读出
        FileWriter fs = new FileWriter("idea_text\\input.txt");
        prop.store(fs, null);
    }
}
