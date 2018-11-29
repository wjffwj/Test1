package 数据结构;

public class DoubleLinkedList<E> {
    private Node first;
    private Node last;
    private int length = 0;

    class Node {
        private Node pre;
        private Node next;
        private E e;

        public Node(Node pre, Node next, E e) {
            this.pre = pre;
            this.next = next;
            this.e = e;
        }
    }

    public void addFirst(E e) {
        if (first == null) {//链表为空
            Node node = new Node(null, null, e);
            this.first = node;
            this.last = node;
            length++;
        } else {
            Node node = new Node(null, first, e);
            this.first.pre = node;
            this.first = node;
            length++;
        }
    }

    public void addLast(E e) {
        if (last == null) {
            Node node = new Node(null, null, e);
            this.first = node;
            this.last = node;
            length++;
        } else {
            Node node = new Node(last, null, e);
            this.last.next = node;
            this.last = node;
            length++;
        }
    }

    public void insertPrevious(int index, E value) {
        Node curNode = getNode(index);
        Node preNode = curNode.pre;
        Node insertNode=new Node(preNode,curNode,value);
        preNode.next=insertNode;
        curNode.pre=insertNode;
    }

    public Node getNode(int index){
        if( index<0 || index>length-1 ) throw new IndexOutOfBoundsException();
        Node node=first;
        for(int i=0;i<length;i++){
            node=node.next;
        }
        return node;
    }

    public static void main(String[] args) {
        DoubleLinkedList<Integer> list=new DoubleLinkedList<>();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);

    }


}
