package Assignment_1;

public class Main {
    public static void main(String[] args) {

   /* ================================
           Question 1: Clone Array
        ================================= */
        int[] arr = {1, 2, 3, 4};
        int[] cloned = Assignment1.cloneArray(arr);
        System.out.println("Q1: Array cloned");

        /* ================================
           Question 2: Remove random element
        ================================= */
        int[] randomRemoved = Assignment1.removeRandomElement(arr);
        System.out.println("Q2: Random element removed");

        /* ================================
           Question 3: Remove specific element
        ================================= */
        int[] specificRemoved = Assignment1.removeSpecificElement(arr, 3);
        System.out.println("Q3: Specific element removed");

        /* ================================
           Question 4: Reverse array
        ================================= */
        Assignment1.reverseArray(arr);
        System.out.println("Q4: Array reversed");

        /* ================================
           Singly Linked List Setup
        ================================= */
        Node a = new Node(1);
        a.next = new Node(2);
        a.next.next = new Node(3);

        Node b = new Node(4);
        b.next = new Node(5);

        /* ================================
           Question 5: Concatenate lists
        ================================= */
        Node merged = Assignment1.concatenate(a, b);
        System.out.println("Q5: Lists concatenated");

        /* ================================
           Question 6: Rotate list
        ================================= */
        Node rotated = Assignment1.rotateRight(merged, 1);
        System.out.println("Q6: List rotated");

        /* ================================
           Question 7 & 8: Search element
        ================================= */
        int pos = Assignment1.search(rotated, 2);
        System.out.println("Q7 & Q8: Search result = " + pos);

        /* ================================
           Question 9: Delete at position
        ================================= */
        rotated = Assignment1.deleteAtPosition(rotated, 1);
        System.out.println("Q9: Node deleted at position");

        /* ================================
           Doubly Linked List Setup
        ================================= */
        DNode d1 = new DNode(1);
        DNode d2 = new DNode(2);
        DNode d3 = new DNode(2);
        DNode d4 = new DNode(3);

        d1.next = d2;
        d2.prev = d1;
        d2.next = d3;
        d3.prev = d2;
        d3.next = d4;
        d4.prev = d3;

        /* ================================
           Question 10: Remove duplicates
        ================================= */
        Assignment1.removeDuplicates(d1);
        System.out.println("Q10: Duplicates removed");

        /* ================================
           Question 11: Print reverse
        ================================= */
        System.out.print("Q11: Reverse traversal: ");
        Assignment1.printReverse(d1);

        /* ================================
           Question 12: Search in doubly list
        ================================= */
        boolean found = Assignment1.searchDoubly(d1, 3);
        System.out.println("Q12: Search result = " + found);

        /* ================================
           Circular Linked List Setup
        ================================= */
        CNode c1 = new CNode(1);
        CNode c2 = new CNode(2);
        CNode c3 = new CNode(3);

        c1.next = c2;
        c2.next = c3;
        c3.next = c1;

        /* ================================
           Question 13: Insert in circular list
        ================================= */
        c1 = Assignment1.insertCircular(c1, 1, 10);
        System.out.println("Q13: Node inserted");

        /* ================================
           Question 14: Delete from circular list
        ================================= */
        c1 = Assignment1.deleteCircular(c1, 2);
        System.out.println("Q14: Node deleted");

        /* ================================
           Question 15: Search in circular list
        ================================= */
        boolean circularFound = Assignment1.searchCircular(c1, 10);
        System.out.println("Q15: Search result = " + circularFound);

        /* ================================
           Question 16: Split circular list
        ================================= */
        Assignment1.splitCircular(c1);
        System.out.println("Q16: Circular list split");

        System.out.println("\n✅ All questions executed successfully");
    }

    }

