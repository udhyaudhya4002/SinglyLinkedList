package org.example;

public class Main {
    public static void main(String[] args) {
        // Create a new LinkedList instance
        LinkedList list = new LinkedList();

        // Test insertAtstart method
        System.out.println("Inserting 2 at start");
        list.insertAtstart(2);
        list.display();  // Expected: 2 -> Null

        System.out.println("Inserting 1 at start");
        list.insertAtstart(1);
        list.display();  // Expected: 1 -> 2 -> Null

        // Test insertAtend method
        System.out.println("Inserting 10 at end");
        list.insertAtend(10);
        list.display();  // Expected: 1 -> 2 -> 10 -> Null

        System.out.println("Inserting 20 at end");
        list.insertAtend(20);
        list.display();  // Expected: 1 -> 2 -> 10 -> 20 -> Null

        // Test isContains method
        System.out.println("Does the list contain 10? " + list.isContains(10));  // Expected: true
        System.out.println("Does the list contain 5? " + list.isContains(5));    // Expected: false

        // Test removeAtstart method
        System.out.println("Removing first element (start)");
        list.removeAtstart();
        list.display();  // Expected: 2 -> 10 -> 20 -> Null

        // Test removeByValue method
        System.out.println("Removing element with value 10");
        list.removeByValue(10);
        list.display();  // Expected: 2 -> 20 -> Null

        // Test removeAtend method
        System.out.println("Removing last element (end)");
        list.removeAtend();
        list.display();  // Expected: 2 -> Null

        // Test getelementBYIndex method
        try {
            System.out.println("Element at index 0: " + list.getelementBYIndex(0));  // Expected: 2
            System.out.println("Element at index 1: " + list.getelementBYIndex(1));  // Expected: IndexOutOfBoundsException
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Exception: " + e.getMessage());  // Expected: Index out of bounds.
        }

        // Test size method
        System.out.println("Size of the list: " + list.size());  // Expected: 1
    }
}
