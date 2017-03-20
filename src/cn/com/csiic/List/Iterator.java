package cn.com.csiic.List;

/**
 * Created by xiaoliangliang on 2017/3/18.
 * 迭代器ADT接口
 */
public interface Iterator {
    boolean hasNext();//检查迭代器中是否还有剩余的元素
    Object getNext(); //返回迭代器中的下一元素s
}
