package cn.com.csiic.Vector;

/**
 * Created by xiaoliangliang on 2017/3/18.
 * 基于数组的向量实现
 */
public class Vector_Array implements Vector {
    private final int N = 1024; //数组的容量
    private int n = 0;//向量的实际容量
    private Object[] A;//对象数组

    //构造函数
    public Vector_Array(){
        A = new Object[N];
        n = 0;
    }
    //返回向量中元素数目
    @Override
    public int getSize() {
        return n;
    }
    //判断向量是否为空
    @Override
    public boolean isEmpaty() {
        return (0 == n) ? true : false;
    }

    //取秩为r的元素
    @Override
    public Object getAtRank(int r)   //O(1)
            throws ExcptionBoundaryViolation {
        if(0 > r || r >= n)
            throw new ExcptionBoundaryViolation("意外：秩越界");
        return A[r];
    }

    //将秩为r的元素替换为obj
    @Override
    public Object replaceAtRank(int r, Object obj) throws ExcptionBoundaryViolation {
        if(0 > r || r >= n)
            throw new ExcptionBoundaryViolation("意外：秩越界");
        Object bak = A[r];
        A[r] = obj;
        return bak;
    }
    //插入obj，作为秩为r的元素；返回该元素
    @Override
    public Object insertAtRank(int r, Object obj) throws ExcptionBoundaryViolation {
        if(0 > r || r >  n)
            throw new ExcptionBoundaryViolation("意外：秩越界");
        if(n >= N)
            throw new ExcptionBoundaryViolation("意外：数组溢出");
        for (int i=n; i>r;i--) A[i]=A[i-1];//后续元素顺次后移
        A[r]=obj;//插入
        n++;//更新当前规模
        return obj;
    }
    //删除秩为r的元素
    @Override
    public Object removeAtRank(int r) throws ExcptionBoundaryViolation {
        if(0 > r || r >= n)
            throw new ExcptionBoundaryViolation("意外：秩越界");
        Object bak=A[r];
        for(int i=r;i<n;i++) A[i]=A[i+1];//后续元素顺次前移
        n--;//更新当前规模
        return bak;
    }

    @Override
    public String toString() {
        StringBuffer str=new StringBuffer();
        for(int i=0;i<n;i++) {str.append(A[i]).append(" ");}
        return str.toString();
    }
}
