package Stack;

public class myStack {
    class Node {
        public int data;
        public Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node top;
    private int length;

    public myStack() {
        this.top = null;
        this.length = 0;
    }

    public int getLength() {
        return length;
    }

    public boolean isEmply() {
        return length == 0;
    }

    public void push(int data){
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
        length++;
    }

    public int pop(){
        if ( length == 0){
            return 0;
        }
        int k = top.data;
        top = top.next;
        length--;
        return k;
    }



    public static void main(String[] args) {
        myStack stack = new myStack();
        stack.push(0);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(10);
        System.out.println(stack.pop());
        System.out.println(stack.getLength());
    }
}
