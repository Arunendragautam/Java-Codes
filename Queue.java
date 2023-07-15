public class Queue {

    static class QueueB {
       static int arr[];
       static int size;
       static int rear;
        QueueB(int n) {

            arr = new int[n];
            size = n;
            rear = -1;


        }

        public static boolean isEmpty(){

            return rear == -1;
        }
        //add
        public static void add(int data) {
            if(rear == size-1) {
                System.out.println("queue is full");
                return;
            }

            rear = rear + 1;
            arr[rear] = data;

        }
        //remove
        public static int remove() {
            if(isEmpty()) {
                System.out.println("empty queue");
                return -1;
            }

            int front = arr[0];
            for(int i =0; i<rear; i++) {
                arr[i] = arr[i+1];
            }
            return front;

        }



    }
    public static void main(String[] args) {
        

    }
    
}
