import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainApplicationGUI {
    private JFrame frame;
    private JTextArea outputArea;
    private ListADT<Integer> list;
    private StackADT<Integer> stack;
    private QueueADT<Integer> queue;

    public MainApplicationGUI() {
        // Initialize ADTs
        list = new ListADT<>();
        stack = new StackADT<>();
        queue = new QueueADT<>();

        // Create the GUI
        frame = new JFrame("ADT Tester");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 500);

        // Layout
        frame.setLayout(new BorderLayout());

        // Output area
        outputArea = new JTextArea();
        outputArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(outputArea);
        frame.add(scrollPane, BorderLayout.CENTER);

        // Buttons Panel
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4, 3));

        // List buttons
        JButton addToList = new JButton("Add to List");
        JButton removeFromList = new JButton("Remove from List");
        JButton viewList = new JButton("View List");

        // Stack buttons
        JButton pushToStack = new JButton("Push to Stack");
        JButton popFromStack = new JButton("Pop from Stack");
        JButton viewStack = new JButton("View Stack");

        // Queue buttons
        JButton enqueueToQueue = new JButton("Enqueue to Queue");
        JButton dequeueFromQueue = new JButton("Dequeue from Queue");
        JButton viewQueue = new JButton("View Queue");

        // Add buttons to panel
        buttonPanel.add(addToList);
        buttonPanel.add(removeFromList);
        buttonPanel.add(viewList);
        buttonPanel.add(pushToStack);
        buttonPanel.add(popFromStack);
        buttonPanel.add(viewStack);
        buttonPanel.add(enqueueToQueue);
        buttonPanel.add(dequeueFromQueue);
        buttonPanel.add(viewQueue);

        frame.add(buttonPanel, BorderLayout.SOUTH);

        // Button Actions
        addToList.addActionListener(e -> {
            String input = JOptionPane.showInputDialog(frame, "Enter an integer to add to the list:");
            if (input != null && !input.isEmpty()) {
                try {
                    int value = Integer.parseInt(input);
                    list.add(value);
                    outputArea.append("Added to List: " + value + "\n");
                } catch (NumberFormatException ex) {
                    showError("Invalid input. Please enter an integer.");
                }
            }
        });

        removeFromList.addActionListener(e -> {
            String input = JOptionPane.showInputDialog(frame, "Enter the index to remove from the list:");
            if (input != null && !input.isEmpty()) {
                try {
                    int index = Integer.parseInt(input);
                    int removed = list.remove(index);
                    outputArea.append("Removed from List: " + removed + "\n");
                } catch (IndexOutOfBoundsException ex) {
                    showError("Invalid index. Please enter a valid index.");
                } catch (NumberFormatException ex) {
                    showError("Invalid input. Please enter an integer.");
                }
            }
        });

        viewList.addActionListener(e -> {
            outputArea.append("List Contents: ");
            for (int i = 0; i < list.size(); i++) {
                outputArea.append(list.get(i) + " ");
            }
            outputArea.append("\n");
        });

        pushToStack.addActionListener(e -> {
            String input = JOptionPane.showInputDialog(frame, "Enter an integer to push onto the stack:");
            if (input != null && !input.isEmpty()) {
                try {
                    int value = Integer.parseInt(input);
                    stack.push(value);
                    outputArea.append("Pushed to Stack: " + value + "\n");
                } catch (NumberFormatException ex) {
                    showError("Invalid input. Please enter an integer.");
                }
            }
        });

        popFromStack.addActionListener(e -> {
            try {
                int popped = stack.pop();
                outputArea.append("Popped from Stack: " + popped + "\n");
            } catch (IllegalStateException ex) {
                showError("Stack is empty.");
            }
        });

        viewStack.addActionListener(e -> {
            outputArea.append("Stack Contents: ");
            StackADT<Integer> tempStack = new StackADT<>();
            while (!stack.isEmpty()) {
                int value = stack.pop();
                outputArea.append(value + " ");
                tempStack.push(value);
            }
            while (!tempStack.isEmpty()) {
                stack.push(tempStack.pop());
            }
            outputArea.append("\n");
        });

        enqueueToQueue.addActionListener(e -> {
            String input = JOptionPane.showInputDialog(frame, "Enter an integer to enqueue:");
            if (input != null && !input.isEmpty()) {
                try {
                    int value = Integer.parseInt(input);
                    queue.enqueue(value);
                    outputArea.append("Enqueued to Queue: " + value + "\n");
                } catch (NumberFormatException ex) {
                    showError("Invalid input. Please enter an integer.");
                }
            }
        });

        dequeueFromQueue.addActionListener(e -> {
            try {
                int dequeued = queue.dequeue();
                outputArea.append("Dequeued from Queue: " + dequeued + "\n");
            } catch (IllegalStateException ex) {
                showError("Queue is empty.");
            }
        });

        viewQueue.addActionListener(e -> {
            outputArea.append("Queue Contents: ");
            QueueADT<Integer> tempQueue = new QueueADT<>();
            while (!queue.isEmpty()) {
                int value = queue.dequeue();
                outputArea.append(value + " ");
                tempQueue.enqueue(value);
            }
            while (!tempQueue.isEmpty()) {
                queue.enqueue(tempQueue.dequeue());
            }
            outputArea.append("\n");
        });

        // Show frame
        frame.setVisible(true);
    }

    private void showError(String message) {
        JOptionPane.showMessageDialog(frame, message, "Error", JOptionPane.ERROR_MESSAGE);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(MainApplicationGUI::new);
    }
}
