package Queue;

public class myQueue {
    class Node {
        public int data;
        public Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node front;
    private Node rear;
    private int length;

    public myQueue() {
        this.front = null;
        this.rear = null;
        this.length = 0;
    }

    public int getLength() {
        return length;
    }

    public boolean isEmply() {
        return length == 0;
    }

    public void enqueue(int data) {
        Node newNode = new Node(data);
        // TH1: queue rong~ -> front = newNode va` rear = newNode;
        if (isEmply()) {
            front = newNode;
            rear = newNode;
        }
        else{
            rear.next = newNode;        
        }
        rear = newNode;
        length++;
    }

    public int dequeue(){
        if ( length == 0){
            return 0;
        }
        int k = front.data;
        front = front.next;
        length--;
        return k;
    }


    public static void main(String[] args) {
        myQueue queue = new myQueue();
        queue.enqueue(100);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        System.out.println(queue.dequeue());
        System.out.println(queue.getLength());
    }

}
