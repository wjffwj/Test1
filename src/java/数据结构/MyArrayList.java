package 数据结构;

import java.util.Arrays;

/**
 * 顺序表
 */
public class MyArrayList implements Ilist {

    public Object[] items;//存储空间
    private int curlen;//线性表当前长度
    public MyArrayList(int maxSize){
        curlen=0;
        items=new Object[maxSize];
    }

    @Override
    public void clear() {
        curlen=0;
    }

    @Override
    public boolean isEmpty() {
        return curlen==0;
    }

    @Override
    public int length() {
        return curlen;
    }

    @Override
    public Object get(int i) throws Exception {
        if(i<0||i>curlen-1){
            throw new Exception("out of bound");
        }
        return items[i];
    }

    @Override
    public void insert(Object x)  {
        if(curlen==items.length){//空间满了进行数组扩容
            Object[] objects = Arrays.copyOf(items, curlen * 2);//将数据存到这个扩容的数组里
            items=objects;
        }
        curlen=curlen+1;
        items[curlen-1]=x;
    }

    @Override
    public void remove(int i) {

    }

    @Override
    public void show() {
        for(int i=0;i<items.length;i++){
           if(items[i]==null){
               break;
           }
            System.out.println(items[i]);
        }
    }
    public static void main(String[] args) {
        MyArrayList list=new MyArrayList(2);
        list.insert(1);
        list.insert(2);
        list.insert(3);
        System.out.println(list.length());
        list.show();
    }
}
