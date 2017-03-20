package cn.com.csiic.List;

/**
 * Created by xiaoliangliang on 2017/3/18.
 *  基于双向链表实现列表结构
 */
public class List_DLNode implements List {
    protected int numElem;//列表的实际规模
    protected DLNode header,trailer;//哨兵：首节点+末节点

    //构造函数
    public List_DLNode(){
        numElem = 0;//空表
        header = new DLNode(null,null,null);//头节点
        trailer = new DLNode(null,null,null);//尾节点
        header.setNext(trailer);//头、尾节点相互链接
    }

    /**************************** 辅助方法 ****************************/

    //检查给定位置在列表中是否合法，若是，则将其转换为*DLNode
    protected DLNode checkPosition(Position p) throws ExcptionPositionInvalid{
        if(null == p)
            throw new ExcptionPositionInvalid("意外：传递给List_DLNode的位置是null");
        if(header == null)
            throw new ExcptionPositionInvalid("意外：头节点哨兵位置非法");
        if(trailer == p)
            throw new ExcptionPositionInvalid("意外：尾结点哨兵位置非法");
        DLNode temp = (DLNode)p;
        return temp;
    }


    /**************************** ADT方法 ****************************/

    //查询列表当前的规模
    @Override
    public int getSize() {
        return numElem;
    }

    //判断列表是否为空
    @Override
    public boolean isEmpty() {
        return numElem == 0;
    }

    //返回第一个元素（的位置）
    @Override
    public Position first() throws ExceptionListEmpty {
        if(isEmpty())
            throw new ExceptionListEmpty("意外：列表空");

        return header.getNext();
    }

    //返回最后一个元素（的位置）
    @Override
    public Position last() throws ExceptionListEmpty {
        if(isEmpty())
            throw new ExceptionListEmpty("意外：列表空");
        return trailer.getPrev();
    }

    //返回紧接给定位置之后的元素（的位置）
    @Override
    public Position getNext(Position p) throws ExcptionPositionInvalid, ExcptionBoundaryViolation {
        DLNode v = checkPosition(p);
        DLNode next =  v.getNext();
        if(next == trailer)
            throw new ExcptionBoundaryViolation("意外：企图越过列表后端");
        return next;
    }

    //返回紧靠给定位置之前的元素（的位置）
    @Override
    public Position getPrev(Position p) throws ExcptionPositionInvalid, ExcptionBoundaryViolation {
        DLNode v = checkPosition(p);
        DLNode prev =v.getPrev();
        if (prev==header)
            throw new ExcptionBoundaryViolation("意外：企图越过列表后端");
        return prev;
    }

    @Override
    public Position insertFirst(Object e) {
        return null;
    }

    @Override
    public Position insertLast(Object e) {
        return null;
    }

    @Override
    public Position insertAfter(Position p, Object e) throws ExcptionPositionInvalid {
        return null;
    }

    @Override
    public Position insertBefore(Position p, Object e) throws ExcptionPositionInvalid {
        return null;
    }

    @Override
    public Object remove(Position p) throws ExcptionPositionInvalid {
        return null;
    }

    @Override
    public Object removeFirst() {
        return null;
    }

    @Override
    public Object replace(Position p, Object e) throws ExcptionPositionInvalid {
        return null;
    }

    @Override
    public Iterator positions() {
        return null;
    }

    @Override
    public Iterator elements() {
        return null;
    }
}
