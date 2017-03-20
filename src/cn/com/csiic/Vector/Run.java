package cn.com.csiic.Vector;

import java.util.ArrayList;

/**
 * Created by xiaoliangliang on 2017/3/18.
 */
public class Run {
    public static void main(String args[]){
        Vector_ExtArray va=new Vector_ExtArray();
        //Vector_Array va= new Vector_Array();
        long start = System.currentTimeMillis();
        for (int i=0; i<200 ;i++)
        va.insertAtRank(i,"xl"+i);

        //V.insertAtRank(0,"Q");
        //ArrayList
        long stop=System.currentTimeMillis();
        System.out.println(start-stop);
        System.out.println(va.toString());

    }
}
