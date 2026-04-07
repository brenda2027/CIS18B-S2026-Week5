package edu.norcocollege.cis18b.week5.mini04;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeWorkbench {

    public static void main(String[] args) {
        runFifoDemo();
        runLifoDemo();
    }

    private static void runFifoDemo() {
        Deque<String> helpDesk = new ArrayDeque<>();

        helpDesk.addLast("import roster");
        helpDesk.addLast("email reminder");
        helpDesk.addFirst("urgent outage");

        while (!helpDesk.isEmpty()) {
            System.out.println("FIFO processed: " + helpDesk.removeFirst());
        }
    }

    private static void runLifoDemo() {
        Deque<String> undoStack = new ArrayDeque<>();

        undoStack.push("rename file");
        undoStack.push("insert checkpoint");

        while (!undoStack.isEmpty()) {
            System.out.println("Undo popped: " + undoStack.pop());
        }
        // TODO: Add one more stack action and show the updated LIFO behavior.

    undoStack.push("delete section");
    System.out.println("Undo popped: " + undoStack.pop());
    System.out.println("Why not legacy Stack: Stack is older and ArrayDeque is the preferred modern choice for stack behavior.");    
    }
}