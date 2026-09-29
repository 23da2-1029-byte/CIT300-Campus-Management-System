/** Stack (LIFO) of recent actions - most recent action shown first (Member 2). */
public class ActionStack {
    private static class Node {
        String action; Node next;
        Node(String a, Node n) { action = a; next = n; }
    }
    private Node top;

    public void push(String action) { top = new Node(action, top); }

    public String pop() {
        if (top == null) return null;
        String a = top.action; top = top.next; return a;
    }

    public void display() {
        if (top == null) { System.out.println("No recent actions."); return; }
        int i = 1;
        for (Node c = top; c != null; c = c.next) System.out.println(i++ + ". " + c.action);
    }
}
