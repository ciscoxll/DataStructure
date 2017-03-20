package cn.com.csiic.List;

/**
 * Created by xiaoliangliang on 2017/3/18.
 * 当作为参数的数组下标、向量的秩或列表的位置非法时，本意外将被抛出
 */
public class ExcptionPositionInvalid extends RuntimeException {
    public ExcptionPositionInvalid(String err){
        super(err);
    }
}
