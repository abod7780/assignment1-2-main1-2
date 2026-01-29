package Assignment_2;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class Assignment2 {
    // Question 1: Reverse a string using Stack
    public static String reverseString(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            stack.push(c);
        }
        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }
        return result.toString();
    }

    // Question 2: Sort a stack using only another stack
    public static Stack<Integer> sortStack(Stack<Integer> stack) {
        Stack<Integer> temp = new Stack<>();
        while (!stack.isEmpty()) {
            int current = stack.pop();
            while (!temp.isEmpty() && temp.peek() > current) {
                stack.push(temp.pop());
            }
            temp.push(current);
        }
        return temp;
    }

    // Question 3: Reverse the order of elements in a queue
    public static void reverseQueue(Queue<Integer> queue) {
        Stack<Integer> stack = new Stack<>();
        while (!queue.isEmpty()) {
            stack.push(queue.poll());
        }
        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }
    }

    // Question 4: Implement a priority queue (smallest element dequeued first)
    static class MyPriorityQueue {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        public void enqueue(int value) {
            pq.add(value);
        }

        public int dequeue() {
            return pq.poll();
        }
    }

    // Question 5: Merge two sorted queues into a single sorted queue
    public static Queue<Integer> mergeQueues(Queue<Integer> q1, Queue<Integer> q2) {
        Queue<Integer> result = new LinkedList<>();
        while (!q1.isEmpty() && !q2.isEmpty()) {
            if (q1.peek() <= q2.peek()) {
                result.add(q1.poll());
            } else {
                result.add(q2.poll());
            }
        }
        while (!q1.isEmpty()) {
            result.add(q1.poll());
        }
        while (!q2.isEmpty()) {
            result.add(q2.poll());
        }
        return result;
    }
}
