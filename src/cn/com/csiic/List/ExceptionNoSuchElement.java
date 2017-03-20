package cn.com.csiic.List;

/**
 * Created by xiaoliangliang on 2017/3/19.
 * 当试图对没有后继的迭代器元素应用getNext()方法时，本意外将被抛出
 */
public class ExceptionNoSuchElement extends RuntimeException {
    public  ExceptionNoSuchElement(String err){
        super(err);
    }
}
