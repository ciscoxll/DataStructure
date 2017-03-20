package cn.com.csiic.Vector;

/**
 * Created by xiaoliangliang on 2017/3/18.
 * 当作为参数的数组下标、向量的秩或列表的位置越界时，本意外将被抛出
 */
public class ExcptionBoundaryViolation extends RuntimeException {
    public ExcptionBoundaryViolation(String err){
        super(err);
    }
}
