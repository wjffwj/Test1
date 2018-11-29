package 数据结构;

public interface Ilist {
    public void clear();//清空

    public boolean isEmpty();//判断是否为空

    public int length();//获取表长度

    public Object get(int i) throws Exception;//获取表元素

    public void insert( Object x ) throws Exception;//插入操作

    public void remove(int i);//删除操作

    public void show();//打印操作

}
