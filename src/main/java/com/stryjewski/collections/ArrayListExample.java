package com.stryjewski.collections;

import java.util.ArrayList;
import java.util.List;

/**
 * Demonstrates the most common ArrayList operations.
 *
 * Characteristics:
 * - Ordered collection
 * - Allows duplicate elements
 * - Allows null values
 * - Not thread-safe
 * - Backed by a dynamically resizing array
 *
 * Common Operations:
 * - add()
 * - get()
 * - set()
 * - remove()
 * - contains()
 * - size()
 *
 * Time Complexity:
 * - get()              O(1)
 * - set()              O(1)
 * - add()              O(1) amortized
 * - add(index)         O(n)
 * - remove(index)      O(n)
 * - contains()         O(n)
 */
public class ArrayListExample {

    public static void main(String[] args) {
        // Program to the List interface instead of the implementation.
        // This allows us to swap ArrayList for LinkedList later if needed.
        List<String> players = new ArrayList<>();

        //Add elements
        players.add("McDavid");
        players.add("Matthews");
        players.add("Crosby");

        System.out.println("=== Original Hockey Player List ===");

        //for (String player : players) {}
        // reference is replacing for loop here
        printPlayers(players);

        // Get first player by index 0
        System.out.println("\nFirst Player: " + players.get(0));

        // Replace the element at index 1.
        // set() updates the existing element without shifting the list.
        players.set(1, "MacKinnon");

        // Remove Crosby
        players.remove("Crosby");

        System.out.println("\nUpdated List");

        // Print each player in the list
        printPlayers(players);

        // Search for McDavid
        System.out.println("\nContains McDavid? " + players.contains("McDavid"));

        // Get the size of the list of players
        System.out.println("Size of list is " + players.size());

        // Inserting at index 1 requires Java to shift
        // every element from index 1 onward one position to the right.
        players.add(1, "Bedard");

        // After inserting player at index 1
        System.out.println("After inserting players at index 1 in the list");
        printPlayers(players);

        // Getting the size again
        System.out.println("Size of the list is " + players.size());

        // Add a duplicate player
        players.add("McDavid");

        System.out.println("\nDuplicate player added");

        //ArrayList shows the duplicate Mcdavid
        printPlayers(players);

        // Lets show the ArrayList allows a null value
        players.add(null);

        System.out.println("Added a null");

        // Lets print it out again
        printPlayers(players);

        // Remove the first player (index 0)
        players.remove(0);

        System.out.println("\nAfter removing first player");
        printPlayers(players);
    }

    public static void printPlayers(List<String> players) {
        players.forEach(System.out::println);
    }
}

/*
=========================
Interview Notes
=========================

ArrayList

Pros:
✓ Fast random access
✓ Memory efficient
✓ Easy iteration

Cons:
✗ Slow insertions in the middle
✗ Slow removals in the middle
✗ Not thread-safe

Common Interview Questions:
- Difference between ArrayList and LinkedList?
- Why is get() O(1)?
- Why is add(index) O(n)?
- How does ArrayList resize itself?
*/