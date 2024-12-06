//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
//        Stack<Integer> arrayStack = new ArrayStack<>();
//        arrayStack.push(1);
//        arrayStack.push(2);
//        arrayStack.push(3);
//        System.out.println("Array Stack Top: " + arrayStack.peek()); // 3
//        System.out.println("Array Stack Pop: " + arrayStack.pop()); // 3
//        System.out.println("Array Stack Size: " + arrayStack.size()); // 2
//
//        Stack<Integer> linkedListStack = new LinkedListStack<>();
//        linkedListStack.push(10);
//        linkedListStack.push(20);
//        linkedListStack.push(30);
//        System.out.println("Linked List Stack Top: " + linkedListStack.peek()); // 30
//        System.out.println("Linked List Stack Pop: " + linkedListStack.pop()); // 30
//        System.out.println("Linked List Stack Size: " + linkedListStack.size()); // 2

        int graph[][]
                = new int[][] { { 0, 4, 0, 0, 0, 0, 0, 8, 0 },
                { 4, 0, 8, 0, 0, 0, 0, 11, 0 },
                { 0, 8, 0, 7, 0, 4, 0, 0, 2 },
                { 0, 0, 7, 0, 9, 14, 0, 0, 0 },
                { 0, 0, 0, 9, 0, 10, 0, 0, 0 },
                { 0, 0, 4, 14, 10, 0, 2, 0, 0 },
                { 0, 0, 0, 0, 0, 2, 0, 1, 6 },
                { 8, 11, 0, 0, 0, 0, 1, 0, 7 },
                { 0, 0, 2, 0, 0, 0, 6, 7, 0 } };
        ShortestPath t = new ShortestPath();

        // Function call
        t.dijkstra(graph, 0);
        }

    }