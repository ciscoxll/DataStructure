package cn.com.csiic.List;

/**
 * Created by xiaoliangliang on 2017/3/18.
 * 当作为参数的列表已空时，本意外将被抛出
 */
public class ExceptionListEmpty extends RuntimeException {
    public ExceptionListEmpty(String err){
        super(err);
    }
}
