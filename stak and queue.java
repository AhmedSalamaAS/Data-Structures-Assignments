
class MyStack {
    private java.util.ArrayList<Integer> items;

    public MyStack() {
        items = new java.util.ArrayList<>();
    }

    public boolean isEmpty() {
        return items.isEmpty();
    }

    public void push(int item) {
        items.add(item);
    }

    public Integer pop() {
        if (!isEmpty()) {
            return items.remove(items.size() - 1);
        }
        return null;
    }

    public Integer peek() {
        if (!isEmpty()) {
            return items.get(items.size() - 1);
        }
        return null;
    }

    public int size() {
        return items.size();
    }
}


class MyQueue {
    private java.util.LinkedList<Integer> items;

    public MyQueue() {
        items = new java.util.LinkedList<>();
    }

    public boolean isEmpty() {
        return items.isEmpty();
    }

    public void enqueue(int item) {
        items.addLast(item);
    }

    public Integer dequeue() {
        if (!isEmpty()) {
            return items.removeFirst();
        }
        return null;
    }

    public int size() {
        return items.size();
    }
}

public class Main {
    public static void main(String[] args) {
        // Test Stack
        MyStack stack = new MyStack();
        stack.push(10);
        stack.push(20);
        System.out.println("Stack Top: " + stack.peek());

        // Test Queue
        MyQueue queue = new MyQueue();
        queue.enqueue(100);
        queue.enqueue(200);
        System.out.println("Queue Removed: " + queue.dequeue());
    }
}