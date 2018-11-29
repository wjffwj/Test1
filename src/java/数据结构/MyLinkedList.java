package 数据结构;

/**
 * 单向链表
 */
public class MyLinkedList {
    Node head = null;
    /**
     * 链表中的节点
     */
    class Node {
        Node next = null;//节点引用指向下一个节点
        int data;
        public Node(int data) {
            this.data = data;
        }
    }
    /**
     * 向链表中插入数据
     */
    public void addNode(int d) {
        Node newNode = new Node(d);
        if (head == null) {//如果头节点没有数据
            head = newNode;
            return;
        }
        Node tmp = head;
        while (tmp.next != null) {
            tmp = tmp.next;
        }
        tmp.next = newNode;
    }
    /**
     * 链表长度
     */
    public int length() {
        int i = 0;
        Node tmp = head;
        while (tmp != null) {
            i++;
            tmp = tmp.next;
        }
        return i;
    }
    /**
     * 删除第index个节点
     */
    public boolean deleteNode(int index) {
        if (index < 1 || index > length()) {
            return false;
        }
        if (index == 1) {
            head = head.next;
            return true;
        }
        int i = 1;
        Node preNode=head;
        Node curNode=preNode.next;
        while(curNode!=null){
            if(i==index){
                preNode.next=curNode.next;//将匹配到的节点的下一个付给上一个节点的next
                return true;
            }
            preNode=curNode;
            curNode=curNode.next;
            i++;
        }
        return false;
    }
    public void printList(){
        Node tmp=head;
        while(tmp!=null){
            System.out.println(tmp.data);
            tmp=tmp.next;
        }
    }


    public static void main(String[] args) {
        MyLinkedList list=new MyLinkedList();
        list.addNode(1);
        list.addNode(3);
        list.addNode(5);
        list.addNode(6);
        list.addNode(2);
        list.addNode(32);
        list.printList();
        list.deleteNode(1);//删除节点
        list.printList();
    }
}
