import java.util.*;
public class Stack_Queue {
    Stack<Integer> s1=new Stack<>();
    Stack<Integer> s2=new Stack<>();
    public void Add(int data){
        if(s1.isEmpty()){
            s1.push(data);
            return;
        }
        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }
        s1.add(data);
        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }
    }
    public int remove(){
        if(s1.isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        return s1.pop();
    }
    public int peek(){
        if(s1.isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        return s1.peek();
    }
    public boolean isEmpty(){
        return s1.isEmpty();
    }
    public static void main(String[] args) {
        Stack_Queue q=new Stack_Queue();
        q.Add(1);
        q.Add(2);       
        q.Add(3);
        q.Add(4);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
