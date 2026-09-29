/** Queue (FIFO) of student service requests - first come, first served (Member 2). */
public class RequestQueue {
    private static class Node {
        String request; Node next;
        Node(String r) { request = r; }
    }
    private Node front, rear;
    private int size;

    public void enqueue(String request) {
        Node n = new Node(request);
        if (rear == null) front = rear = n;
        else { rear.next = n; rear = n; }
        size++;
    }

    public String dequeue() {
        if (front == null) return null;
        String r = front.request;
        front = front.next;
        if (front == null) rear = null;
        size--;
        return r;
    }

    public int size() { return size; }
}
