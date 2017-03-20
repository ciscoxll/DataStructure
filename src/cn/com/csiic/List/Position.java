package cn.com.csiic.List;

/**
 * Created by xiaoliangliang on 2017/3/18.
 *  位置ADT接口
 */
public interface Position {
    public Object getElem();//返回存放于该位置的元素
    public Object setElem(Object e);//将给定元素存放至该位置，返回此前存放的元素
}
