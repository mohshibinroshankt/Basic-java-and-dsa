import java.util.*;

public class UndoRedoDemo {
    public static void main(String[] args) {
        Stack<String> undoStack = new Stack<>();
        Stack<String> redoStack = new Stack<>();

        undoStack.push("Type A");
        undoStack.push("Type B");

        redoStack.push("Type C");
        redoStack.push("Type D");

        System.out.println("Undo :" +undoStack.peek());
        System.out.println("Redo :" +undoStack.peek());

        System.out.println("undo :" +redoStack.peek());
        System.out.println("redo :" +redoStack.peek());
    }
}
