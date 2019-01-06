package xw.Bp;

import com.csvreader.CsvReader;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class BpMain {
    private final static String FILEPATH = "D:\\20003002#2017-03.csv";
    private final static Set<Integer> NO_NEED_INDEX_SET = new HashSet<Integer>();
    private final static int[] SCW_INDEX = {75,76,77,78,79,80,81,82,83,84,85,86,87,88,89,90,91,92,93,94,95,96,97,98,99,100,101,102,103,104,105,106,107,108,109,110,111,112,113,114};
    private final static int WT_FAULT_CODE_INDEX = 115;

    /*
     *初始化
     */
    private static void init(){
        //初始化不需要的数据的索引NO_NEED_INDEX_SET
        for(int index:SCW_INDEX){
            NO_NEED_INDEX_SET.add(index);
        }
        NO_NEED_INDEX_SET.add(WT_FAULT_CODE_INDEX);
        NO_NEED_INDEX_SET.add(0);
        NO_NEED_INDEX_SET.add(1);

    }
    public static void main(String[] args) {
        init();
        try {
            // 创建CSV读对象
            CsvReader csvReader = new CsvReader(FILEPATH);
            int flag = 0;
            while (csvReader.readRecord()){
                if(flag == 0){
                    //跳过第一行
                    flag++;
                    continue;
                }
                flag++;
                // 读一整行
                String[] value = csvReader.getRawRecord().split(",");
                List<Double> X = new ArrayList<Double>();  //输入
                Double Y = 0.0; //输出默认为0
                for(int i = 0; i < value.length; i++){
                    if(i == WT_FAULT_CODE_INDEX){
                        if(!value[i].equals("0")){
                            //不是0就是1
                            Y = 1.0;
                        }
                    }
                    if(!NO_NEED_INDEX_SET.contains(i)){
                        X.add(Double.valueOf(value[i])) ;
                    }
                }


                List<List<Double>> inPut = new ArrayList<List<Double>>();
                List<List<Double>> outPut = new ArrayList<List<Double>>();

                inPut.add(X);
                List<Double> oneOutPut = new ArrayList<Double>();
                oneOutPut.add(Y);
                outPut.add(oneOutPut);


                Bp bp = new Bp(inPut,outPut,2,1);
                bp.train();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
