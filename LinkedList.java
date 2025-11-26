package org.example;

class Node {
    int data;
    org.example.Node next;

    // Constructor to initialize a node with the given data
    Node(int data) {
        this.data = data;
        next = null;
    }
}

public class LinkedList {
    org.example.Node head;
    int size;

    // Constructor to initialize the LinkedList
    LinkedList() {
        head = null;
        size = 0;
    }

    // Method to insert a node at the start of the list
    public void insertAtstart(int data) {
        org.example.Node newNode = new org.example.Node(data);
        if (head == null) {
            head = newNode;
            size++;
        } else {
            newNode.next = head;
            head = newNode;
            size++;
        }
    }

    // Method to insert a node at the end of the list
    public void insertAtend(int data) {
        org.example.Node newNode = new org.example.Node(data);
        org.example.Node temp = head;
        if (temp == null) {
            head = newNode;
            size++;
        } else {
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
            size++;
        }
    }

    // Method to remove the first node (head) from the list
    public void removeAtstart() {
        if (head != null) {
            head = head.next;
            size--;
        } else {
            System.out.print("List is empty");
        }
    }

    // Method to remove the last node (tail) from the list
    public void removeAtend() {
        org.example.Node temp = head;
        if (temp != null) {
            while (temp.next != null && temp.next.next != null) {
                temp = temp.next;
            }
            temp.next = null;
            size--;
        } else {
            System.out.println("List is empty");
        }
    }

    // Method to remove a node by its value from the list
    public void removeByValue(int data) {
        if (head != null) {
            // Case 1: The node to remove is the head
            if (head.data == data) {
                removeAtstart();
                return;
            }

            // Case 2: The node to remove is not the head
            org.example.Node temp = head;
            while (temp != null && temp.next != null) {
                if (temp.next.data == data) {
                    temp.next = temp.next.next; // Skip the node to remove it
                    size--; // Decrement the size after removal
                    return;
                }
                temp = temp.next; // Move to the next node
            }
            System.out.println("Value not found in the list.");
        } else {
            System.out.println("List is empty.");
        }
    }

    // Method to check if the list contains a specific value
    public boolean isContains(int data) {
        org.example.Node temp = head;
        while (temp != null) {
            if (temp.data == data) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    // Method to get the element at a specific index (0-based index)
    public int getelementBYIndex(int ind) {
        org.example.Node temp = head;
        if (temp != null) {
            // Check if the index is within bounds
            if (ind < 0 || ind >= size) {
                throw new IndexOutOfBoundsException("Index out of bounds.");
            }

            // Traverse the list until the specified index
            for (int i = 0; i < ind; i++) {
                temp = temp.next;
            }
        }
        return temp.data;
    }

    // Method to display all the elements in the list
    public void display() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        org.example.Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("Null");  // End of the list
    }

    // Method to get the size of the list
    public int size() {
        return size;
    }
}
