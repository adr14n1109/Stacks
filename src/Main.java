void main() {
    ListStack stack = new ListStack();

    System.out.println("isEmpty: " + stack.isEmpty());

    System.out.println("push A: " + stack.push("A"));
    System.out.println("push B: " + stack.push("B"));
    System.out.println("push C: " + stack.push("C"));

    System.out.println("size: " + stack.size());
    System.out.println("peek: " + stack.peek());
    System.out.println("search 'A': " + stack.search("A"));
    System.out.println("toString: " + stack);

    System.out.println("pop: " + stack.pop());
    System.out.println("size after pop: " + stack.size());
    System.out.println("toString after pop: " + stack);

    stack.clear();
    System.out.println("isEmpty after clear: " + stack.isEmpty());
    System.out.println("size after clear: " + stack.size());
}