package cn.com.csiic.List;

/**
 * Created by xiaoliangliang on 2017/3/19.
 * 基于列表实现的位置迭代器
 */
public class IteratorPosition implements Iterator {
    private List list;//列表
    private Position nextPosition;//当前（下一个）位置


    //默认构造方法
    public IteratorPosition(){list=null;}

    //构造方法
    public IteratorPosition(List L){
        list = L;
        if (list.isEmpty())//若列表为空，则
            nextPosition = null;//当前位置置空
        else//否则
            nextPosition = list.first();//从第一个位置开始
    }

    //检查迭代器中是否还有剩余的位置
    @Override
    public boolean hasNext() {
        return (nextPosition != null);
    }

    //返回迭代器中的下一位置
    @Override
    public Object getNext() throws ExceptionNoSuchElement{
        if (!hasNext()) throw new ExceptionNoSuchElement("意外：没有下一位置");
        Position currentPosition = nextPosition;
        if (currentPosition == list.last())
            nextPosition = null;
        else
            nextPosition =list.getNext(currentPosition);
        return currentPosition;
    }
}
