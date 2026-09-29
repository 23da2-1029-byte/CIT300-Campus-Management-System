/** Singly linked list that stores all student records (Member 1). */
public class StudentLinkedList {
    private static class Node {
        Student data; Node next;
        Node(Student s) { data = s; }
    }
    private Node head, tail;
    private int count;

    public void add(Student s) {               // add at the end
        Node n = new Node(s);
        if (head == null) head = tail = n;
        else { tail.next = n; tail = n; }
        count++;
    }

    public Student find(String id) {
        for (Node c = head; c != null; c = c.next)
            if (c.data.getId().equals(id)) return c.data;
        return null;
    }

    public boolean remove(String id) {
        Node prev = null, cur = head;
        while (cur != null) {
            if (cur.data.getId().equals(id)) {
                if (prev == null) head = cur.next; else prev.next = cur.next;
                if (cur == tail) tail = prev;
                count--;
                return true;
            }
            prev = cur; cur = cur.next;
        }
        return false;
    }

    public void displayAll() {
        if (head == null) { System.out.println("No student records."); return; }
        for (Node c = head; c != null; c = c.next) System.out.println(c.data);
        System.out.println("Total: " + count);
    }
}
