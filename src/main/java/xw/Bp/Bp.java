package xw.Bp;

import java.util.ArrayList;
import java.util.List;

public class Bp {
    //默认偏置
    private final static double BIAS = 1.0;
    //输入
    private List<List<Double>> inPutList;
    //输出
    private List<List<Double>> outPutList;
    //隐含层权值
    private List<List<List<Double>>> hideW = new ArrayList<List<List<Double>>>();
    //隐含层输出
    private List<List<Double>> hideOutPut = new ArrayList<List<Double>>();
    //输出层权值
    private List<List<Double>> outLayerW = new ArrayList<List<Double>>();
    //隐含层数
    private int hiddenLayerNum;
    //各隐含层节点数
    private List<Integer> hiddenLayerNodeNum = new ArrayList<Integer>();
    //学习速率
    private Double learnRate;

    public Bp(List<List<Double>> inPutList, List<List<Double>> outPutList,int hiddenLayerNum, double learnRate){
        this.inPutList = inPutList;
        this.outPutList = outPutList;
        this.hiddenLayerNum = hiddenLayerNum;

        this.learnRate = learnRate;

        init();
    }

    private void init(){
        //隐含层权值初始化
        for(int i = 0; i < hiddenLayerNum; i++){
            int nodeNum = (int)Math.sqrt(inPutList.get(0).size() * outPutList.get(0).size());
            //每一层的隐含层节点数都=输入节点数*输出节点数的平方根
            this.hiddenLayerNodeNum.add(nodeNum);

            //一层隐含层的权值
            List<List<Double>> singleHideW = new ArrayList<List<Double>>();
            for(int j = 0; j < nodeNum; j++){
                //一个节点的权值
                List<Double> singleNodeW = new ArrayList<Double>();
                if(i == 0) {
                    //第一层的权值个数与输入值个数有关
                    for (int k = 0; k < inPutList.get(0).size(); k++) {
                        singleNodeW.add(Math.random());
                    }
                }else{
                    for (int k = 0; k < hiddenLayerNodeNum.get(i - 1); k++) {
                        singleNodeW.add(Math.random());
                    }
                }
                singleHideW.add(singleNodeW);
            }
            hideW.add(singleHideW);
        }

        //输出层权值初始化
        for(int inPutNum = 0; inPutNum < inPutList.get(0).size(); inPutNum++){
            List<Double> singleOutW = new ArrayList<Double>();
            for(int outPutNum = 0; outPutNum < outPutList.get(0).size(); outPutNum++){
                singleOutW.add(Math.random());
            }
            outLayerW.add(singleOutW);
        }
       System.out.println("初始化成功");
    }

    public void train(){
        for(List<Double> input : inPutList){
            //向前传播
            List<Double> forwardResult =  forward(input,0);

//            //向后传播
//            backward();
        }

        System.out.println("训练完成");

    }

    //向前传播
    private List<Double> forward(List<Double> input,int layer){
        //隐含层结束 计算输出层
         if(layer >= hiddenLayerNum){
             //存储输出层的输出结果
             List<Double> result = new ArrayList<Double>();

             //一个节点一个节点的计算
             for(int nodeNo = 0;nodeNo < hiddenLayerNodeNum.get(layer - 1); nodeNo++){
                 //计算一个节点的输出
                 List<Double> nodeW = outLayerW.get(nodeNo);

                 result.add(oneNodeForward(nodeW,input));
             }

             return result;

         }

        //存储该层的输出结果
        List<Double> oneLayerOut = new ArrayList<Double>();
        //一个节点一个节点的计算
        for(int nodeNo= 0;nodeNo < hiddenLayerNodeNum.get(layer); nodeNo++){
            System.out.println("当前正在计算第["+ layer +"]层，有["+ hiddenLayerNodeNum.get(layer) +"]个节点，正在计算第[" + nodeNo + "]节点");

            //获取该节点的权值
            List<Double> nodeW = hideW.get(layer).get(nodeNo);

            //计算一个节点的输出并添加到该层的输出中
            oneLayerOut.add(oneNodeForward(nodeW,input));
        }
        //添加到模型中
        hideOutPut.add(oneLayerOut);
        //计算下一层
        return forward(oneLayerOut,++layer);

    }

    //计算一个节点的输出
    private double oneNodeForward(List<Double> nodeW,List<Double> input){
        double result = 0.0;

        //计算输出
        for(int i = 0; i < nodeW.size(); i++){
            result = result + nodeW.get(i) * input.get(i);
        }
        //激励函数 加上默认偏置
        return 1d / (1d + Math.exp(-(result + BIAS)));
    }

    private void backward(){

    }

    public static void main(String[] args) {

    }
}
