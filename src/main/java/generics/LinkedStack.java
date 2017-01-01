package generics;

public class LinkedStack<T> {
    private class Node {
        T t;
        Node next;

        Node() {
            t = null;
            next = null;
        }

        Node(T t, Node next) {
            this.t = t;
            this.next = next;
        }

        boolean end() {
            return t == null && next == null;
        }
    }

    private Node top = new Node();

    public void push (T t) {
        top = new Node(t,top);
    }
    public T pop () {
        T t = top.t;
        if (!top.end()) {
            top = top.next;
        }
        return t;
    }

    public static void main(String[] args) {
        LinkedStack<String> stringLinkedStack = new LinkedStack<>();
        for (String s : "Happy new year!".split(" "))
            stringLinkedStack.push(s);
        String s;
        while ((s = stringLinkedStack.pop()) != null) {
            System.out.println(s);
        }
    }
}
