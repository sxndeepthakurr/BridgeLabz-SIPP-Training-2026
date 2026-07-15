class UndoBuffer {
    private String[] data;
    private int top;

    public UndoBuffer(int maxDepth) {
        data = new String[maxDepth];
        top = -1;
    }

    // Push a new edit
    public boolean push(String edit) {
        if (top == data.length - 1) {
            return false; // Stack Full
        }
        data[++top] = edit;
        return true;
    }

    // Undo last edit
    public String pop() {
        if (isEmpty()) {
            throw new RuntimeException("Nothing to undo");
        }
        return data[top--];
    }

    // View latest edit
    public String peek() {
        if (isEmpty()) {
            throw new RuntimeException("Nothing to peek");
        }
        return data[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public static void main(String[] args) {
        UndoBuffer buffer = new UndoBuffer(3);

        buffer.push("Edit1");
        buffer.push("Edit2");
        buffer.push("Edit3");

        System.out.println(buffer.peek());

        System.out.println(buffer.pop());
        System.out.println(buffer.pop());

        System.out.println(buffer.push("Edit4"));
    }
}