import java.util.Collections;
import java.util.PriorityQueue;

public class maxheap {
    public static void main(String[] args) {
        // Max Heap using PriorityQueue
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        // Insert elements
        maxHeap.add(10);
        maxHeap.add(40);
        maxHeap.add(30);
        maxHeap.add(50);
        maxHeap.add(20);

        // Print and remove elements in descending order
        while (!maxHeap.isEmpty()) {
            System.out.println(maxHeap.poll());
        }
    }
}
