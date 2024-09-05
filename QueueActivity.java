import java.util.LinkedList;
import java.util.Queue;

class QueueActivity {
    int front,rear,capacity;
    int [] queue;
    QueueActivity(int c){
        front = 0;
        rear = -1;
        capacity = c;
        queue = new int[capacity];

    }

    void enqueue(int data) {
        if(rear == capacity -1) {
            System.out.println("Queue is Full");
            return;

        }
        queue[++rear] = data;
    }
    void dequeue() {
        if(front > rear) {
            System.out.println("Queue is Empty");
            return;
        }
        for(int i = 0; i < rear; i++){
            queue[i] = queue[i + 1];
        }
        rear--;
    }
        void display(){
            if(front > rear) {
                System.out.println("Queue is Empty");
                return;
            }
            for(int i = 0; i <= rear; i++){
                System.out.println(queue[i] + "<---");
            }
            System.out.println("");
        }

        void getFront(){
            if(rear == -1){
                System.out.println("Queue is Empty");
                return;
            }
            System.out.println("First Element : " + queue[front]);
        }
        void getRear(){
            if(front == -1){
                System.out.println("Queue is Empty");
                return;
            }
            System.out.println("Last Element : " + queue[rear]);
        }



    public static void main(String[] args) {

        QueueActivity q = new QueueActivity(4);

        q.display();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.display();

        q.dequeue();
        q.dequeue();

        q.enqueue(40);
        q.enqueue(50);
        q.display();

        q.getFront();
        
        q.getRear();
        





        // Queue<String> games = new LinkedList<String>();

        // games.offer("RDR2");
        // games.offer("Witcher3");

        //     System.out.println("Games :" + games);


    }



}