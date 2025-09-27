public class Queue_LL {
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static Node head=null;
    static Node tail=null; 
    public boolean isEmpty(){
        return head==null;
    }
    public void add(int data){
        Node newNode=new Node(data);
        if(head==null){
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }
    public int remove(){
        if(isEmpty()){
            System.out.println("Queue is empty");
        }
        int front=head.data;
        if(head==tail){
            head=tail=null;
        } else {
            head=head.next;
        }
        return front;
    }
    public static void main(String[] args) {
        Queue_LL q=new Queue_LL();
        q.add(1);
        q.add(2);       
        q.add(3);
        q.add(4);
        while(!q.isEmpty()){
            System.out.println(q.remove());
        }
    }
}
