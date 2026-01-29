package Assignment_1;

import java.util.Random;

public class Assignment1 {

    //1.  Write a program to clone an array

    public static int[] cloneArray(int[] arr) {
        return arr.clone();
    }

   //2. Write a program in Java to remove a random element from an array

    public static int[] removeRandomElement(int[] arr) {
        Random random = new Random();
        int index = random.nextInt(arr.length);

        int[] newArr = new int[arr.length - 1];
        for (int i = 0, j = 0; i < arr.length; i++) {
            if (i != index)
                newArr[j++] = arr[i];
        }
        return newArr;
    }

   //3. Write a program in Java to remove a specific element from an array

    public static int[] removeSpecificElement(int[] arr, int target) {
        int count = 0;
        for (int x : arr)
            if (x != target) count++;

        int[] newArr = new int[count];
        for (int i = 0, j = 0; i < arr.length; i++) {
            if (arr[i] != target)
                newArr[j++] = arr[i];
        }
        return newArr;
    }

  //4. Write a Java program to reverse an array

    public static void reverseArray(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
    }

    //5. Write a function to concatenate two linked lists

    public static Node concatenate(Node a, Node b) {
        if (a == null) return b;
        Node temp = a;
        while (temp.next != null)
            temp = temp.next;
        temp.next = b;
        return a;
    }

   //6. Write a function in to rotate a linked list to the right by k places, where k is a non-negative integer

    public static Node rotateRight(Node head, int k) {
        if (head == null) return head;

        for (int i = 0; i < k; i++) {
            Node temp = head;
            while (temp.next.next != null)
                temp = temp.next;

            temp.next.next = head;
            head = temp.next;
            temp.next = null;
        }
        return head;
    }

    //7. Write a function to search for element in singly linked list and return its position .
    //8. Write a function to find the index of a given data value in a linked list If the data value is not found in the linked list, return -1

    public static int search(Node head, int key) {
        int pos = 0;
        while (head != null) {
            if (head.data == key)
                return pos;
            pos++;
            head = head.next;
        }
        return -1;
    }

   //9. Write a function to remove at specific position from singly linked list

    public static Node deleteAtPosition(Node head, int pos) {
        if (pos == 0)
            return head.next;

        Node temp = head;
        for (int i = 0; i < pos - 1; i++)
            temp = temp.next;

        temp.next = temp.next.next;
        return head;
    }

    //10. Write a function to remove duplicates elements from doubly Linked List .

    public static void removeDuplicates(DNode head) {
        DNode i = head;
        while (i != null) {
            DNode j = i.next;
            while (j != null) {
                if (i.data == j.data) {
                    j.prev.next = j.next;
                    if (j.next != null)
                        j.next.prev = j.prev;
                }
                j = j.next;
            }
            i = i.next;
        }
    }

    //11. Write a function to traverse a doubly linked list in reverse and print all the elements.

    public static void printReverse(DNode head) {
        DNode temp = head;
        while (temp.next != null)
            temp = temp.next;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.prev;
        }
        System.out.println();
    }

   //12. Write a function to search for an element in a doubly linked list .

    public static boolean searchDoubly(DNode head, int key) {
        while (head != null) {
            if (head.data == key)
                return true;
            head = head.next;
        }
        return false;
    }

  //13. Write a function to insert a node at a specific position in a circular linked list.

    public static CNode insertCircular(CNode head, int pos, int data) {
        CNode newNode = new CNode(data);

        if (pos == 0) {
            CNode temp = head;
            while (temp.next != head)
                temp = temp.next;

            temp.next = newNode;
            newNode.next = head;
            return newNode;
        }

        CNode temp = head;
        for (int i = 0; i < pos - 1; i++)
            temp = temp.next;

        newNode.next = temp.next;
        temp.next = newNode;
        return head;
    }

    //14. Write a function to delete a node from a specific position in a circular linked list

    public static CNode deleteCircular(CNode head, int pos) {
        if (pos == 0) {
            CNode temp = head;
            while (temp.next != head)
                temp = temp.next;

            temp.next = head.next;
            return head.next;
        }

        CNode temp = head;
        for (int i = 0; i < pos - 1; i++)
            temp = temp.next;

        temp.next = temp.next.next;
        return head;
    }

    //15. Write a function to search for an element in a circular linked list.

    public static boolean searchCircular(CNode head, int key) {
        CNode temp = head;
        do {
            if (temp.data == key)
                return true;
            temp = temp.next;
        } while (temp != head);

        return false;
    }

//16. Write a function to split a circular linked list into two halves

    public static void splitCircular(CNode head) {
        CNode slow = head, fast = head;

        while (fast.next != head && fast.next.next != head) {
            slow = slow.next;
            fast = fast.next.next;
        }

        CNode head1 = head;
        CNode head2 = slow.next;

        slow.next = head1;
        fast.next = head2;
    }
}

//Node Classes

class Node {
    int data;
    Node next;
    Node(int data) { this.data = data; }
}

class DNode {
    int data;
    DNode next, prev;
    DNode(int data) { this.data = data; }
}

class CNode {
    int data;
    CNode next;
    CNode(int data) { this.data = data; }


}
