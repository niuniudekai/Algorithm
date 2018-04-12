package xw;

import java.io.*;

/**
 * Created by Administrator on 2018/4/8.
 */
public class test {


    public static void main(String args[]){
        String fileName = "d:\\test.txt";
        File file = new File(fileName);
        Long filelength = file.length();
        System.out.println(filelength);
        byte[] filecontent = new byte[filelength.intValue()];
        try {
//            FileInputStream in = new FileInputStream(file);
//            in.read(filecontent);
//            in.close();
            BufferedReader in = new BufferedReader (new FileReader(fileName));
            String s;
            StringBuilder content = new StringBuilder();
            while ((s = in.readLine()) != null){
                content.append(s);
            }



            PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(file)));
            out.write("ssss\nsss");
            out.close();
            System.out.println(content);

            while ((s = in.readLine()) != null){
                content.append(s);
            }

            in.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }



    }

}
