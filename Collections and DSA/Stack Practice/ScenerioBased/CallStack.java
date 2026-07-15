class CallStack {

    private static class Frame {
        String functionName;
        Frame next;

        Frame(String functionName, Frame next) {
            this.functionName = functionName;
            this.next = next;
        }
    }

    private Frame top;

    // Push function
    public void push(String functionName) {
        top = new Frame(functionName, top);
    }

    // Pop function
    public String pop() {
        if (isEmpty()) {
            throw new RuntimeException("No active function");
        }

        String name = top.functionName;
        top = top.next;
        return name;
    }

    // Peek function
    public String peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack Empty");
        }
        return top.functionName;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public static void main(String[] args) {
        CallStack stack = new CallStack();

        stack.push("main()");
        stack.push("display()");
        stack.push("calculate()");

        System.out.println(stack.peek());

        System.out.println(stack.pop());

        System.out.println(stack.peek());
    }
}