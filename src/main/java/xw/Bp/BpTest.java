package xw.Bp;

import java.util.ArrayList;
import java.util.List;

public class BpTest {
    public static void main(String[] args) {
        List<List<Double>> inPut = new ArrayList<List<Double>>();
        List<Double> oneInPut = new ArrayList<Double>();

        for(int i = 0; i < 5; i++){
            oneInPut.add(1.0);
        }
        inPut.add(oneInPut);

        List<List<Double>> outPut = new ArrayList<List<Double>>();
        List<Double> oneOutPut = new ArrayList<Double>();

        for(int i = 0; i < 1; i++){
            oneOutPut.add(1.0);
        }
        outPut.add(oneOutPut);

        Bp bp = new Bp(inPut,outPut,2,1);
        bp.train();
    }
}
