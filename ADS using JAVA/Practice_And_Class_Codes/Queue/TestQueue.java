package Queue;
public class TestQueue {
    private int maxSize;
    private int front;
    private int rear;
    private int[] queueArray;

    public TestQueue(int size) {
        maxSize = size;
        queueArray = new int[maxSize];
        front = 0;
        rear = -1;
    }

    public void push(int value) {
        if (rear == maxSize - 1) {
            System.out.println("Queue is full. Cannot Push " + value);
        } else {
            queueArray[++rear] = value;
        }
    }

    public int pop() {
        if (front > rear) {
            System.out.println("Queue is empty.");
            return -1;
        } else {
            return queueArray[front++];
        }
    }

    public boolean isEmpty() {
        return front > rear;
    }

    public void displayQueueData() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }
        System.out.println("***************************");
        System.out.println("Data in the queue:");
        for (int i = front; i <= rear; i++) {
            System.out.println(queueArray[i]);
        }
    }

    public static void main(String[] args) {
        TestQueue queue = new TestQueue(5);

        queue.push(1);
        System.out.println("1 is pushed");
        queue.push(2);
        System.out.println("2 is pushed");
        queue.push(3);
        System.out.println("3 is pushed");

        queue.displayQueueData();

        queue.push(4);
        System.out.println("4 is pushed");
        queue.push(5);
        System.out.println("5 is pushed");

        queue.displayQueueData();

        System.out.println("Popped: " + queue.pop());
        System.out.println("Popped: " + queue.pop());

        queue.displayQueueData();
    }
}
