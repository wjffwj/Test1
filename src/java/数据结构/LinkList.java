package 数据结构;

public class LinkList {
    Node head=null;
    class Node{
        int data;
        Node next;
        public Node(Node next,int data){
            this.next=next;
            this.data=data;
        }
    }

    /**
     * 向链表尾部添加元素
     */
    public void add(int data){
        Node node=new Node(null,data);
        if(head==null){
            head=node;
            return;
        }
        Node tmp=head;
        while(tmp.next!=null){
            tmp=tmp.next;
        }
        tmp.next=node;
    }

    /**
     * 遍历链表
     */
    public void print(){
       Node tmp=head;
       while(tmp!=null){
           System.out.println(tmp.data);
           tmp=tmp.next;
       }
    }

    public static void main(String[] args) {
        LinkList linkList=new LinkList();
        linkList.add(1);
        linkList.add(32);
        linkList.add(1231);
        linkList.print();
    }

}
