package xw;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Administrator on 2018/4/8.
 */
public class test {
    public static int sum = 0;
    public static Object LOCK = new Object();

    class ThreadTest extends Thread {
        private int begin;
        private int end;

        @Override
        public void run() {
                int result = getSums();
            synchronized (LOCK) {
                sum += result;
                System.out.println("from "+Thread.currentThread().getName()+" sum="+sum);
            }
        }
        private int getSums(){
            int sums = 0;
            for (int i = begin; i <= end; i++) {
                sums += i;
            }
            return  sums;
        }
        public ThreadTest(int begin, int end) {
            this.begin = begin;
            this.end = end;
        }
    }

    public static void main(String[] args)  throws InterruptedException{
//        test add = new test();
//        ThreadTest thread1 = add.new ThreadTest(1, 25);
//        ThreadTest thread2 = add.new ThreadTest(26, 50);
//        ThreadTest thread3 = add.new ThreadTest(51, 75);
//        ThreadTest thread4 = add.new ThreadTest(76, 100);
//        thread1.start();
//        thread2.start();
//        thread3.start();
//        thread4.start();
//
//        thread1.join();
//        thread2.join();
//        thread3.join();
//        thread4.join();
//        System.out.println("total result: "+sum);

        Queue<Integer> queue = new LinkedList<>();

        queue.offer(1);

        queue.offer(2);

        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.isEmpty());

    }
//    public static void main(String args[]){
//        String fileName = "d:\\test.txt";
//        File file = new File(fileName);
//        Long filelength = file.length();
//        System.out.println(filelength);
//        byte[] filecontent = new byte[filelength.intValue()];
//        try {
////            FileInputStream in = new FileInputStream(file);
////            in.read(filecontent);
////            in.close();
//            BufferedReader in = new BufferedReader (new FileReader(fileName));
//            String s;
//            StringBuilder content = new StringBuilder();
//            while ((s = in.readLine()) != null){
//                content.append(s);
//            }
//
//
//
//            PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(file)));
//            out.write("ssss\nsss");
//            out.close();
//            System.out.println(content);
//
//            while ((s = in.readLine()) != null){
//                content.append(s);
//            }
//
//            in.close();
//
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//
//
//    }

}
