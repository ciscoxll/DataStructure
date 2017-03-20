package cn.com.csiic.Vector;

/**
 * Created by xiaoliangliang on 2017/3/18.
 *向量接口
 */

public interface Vector {
    //返回向量中元素数目
    public int getSize();

    //判断向量是否为空
    public boolean isEmpaty();

    //取秩为r的元素
    public Object getAtRank(int r)
            throws ExcptionBoundaryViolation;

    //将秩为r的元素替换为obj
    public Object replaceAtRank(int r,Object obj)
            throws ExcptionBoundaryViolation;

    //插入obj，作为秩为r的元素；返回该元素
    public Object insertAtRank(int r,Object obj)
            throws ExcptionBoundaryViolation;
    //删除秩为r的元素
    public Object removeAtRank(int r)
            throws ExcptionBoundaryViolation;


}
