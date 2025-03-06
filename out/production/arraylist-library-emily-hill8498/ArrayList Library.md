# Overview
In this project, you will create a digital Library system that manages a collection of media items using Java's ArrayList. These items can be songs, TV shows, movies, etc; the kind of media we are storing is arbitrary. This project will help you understand how to effectively use ArrayLists to store, manipulate, and organize data.

# Part I: Library
Following our object-based framework, we'll create a Library to act as the "shell" around our ArrayList


| Name                            | Purpose                                                                                                                                       |
| ------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------- |
| ArrayList \<String\> collection | The main data structure of our Library object.                                                                                                |
| Library()                       | Class Constructor. Initializes an Empty ArrayList                                                                                             |
| addItem(String item)            | Object method. Adds a net item to the end of the library.                                                                                     |
| removeItem(String item)         | Removes the item from the library if it exists. If item is not found, does nothing.                                                           |
| getNextItem()                   | Returns the item at the "top" of the library order.                                                                                           |
| skipNextItem()                  | Removes the next item and shrinks the library.                                                                                                |
| sortAlphabet()                  | Sorts the ArrayList in alphabetical order. *(Note: For this, you'll have to research the documentation for how sort() works with ArrayLists)* |
| find(String item)               | Returns the position of the searched item, or indicates that the item is not in the library.                                                  |
| shuffle()                       | Randomizes the order of items in the library.                                                                                                 |
# Part II: Main
Our main method will handle fielding information between the user and the Library class, and act as our "player" for our media library. Each function is expressed as a statement, but your Main Method must run a method with the following functionality:

- "Play" - "Pops" the current item from the library and stores it in a separate *String* variable. This function should print: "Now Playing: (Item)" to indicate the item collected from the library.
- Skip - Skips the current item in the library.
- Add - Adds a new item to the end of the library.
- Remove - Removes an item from the library, if it exists.
- Sort - Sorts the library alphabetically.
- Shuffle - Randomizes the library
- Find - Returns the position of the item, or indicates that item does not exist.
- Exit - Quits the program.

# Things to Remember...
- This project simulates a single-ended "Queue" in Java, where each item in the collection is ordered as "First in; first out." Remember that items in the collection must be removed from the "front" of the library, and appended to the "end".

- The items in the library are completely arbitrary, feel free to stylize your program to simulate music, tv shows, games, etc. The objective here is to understand and manipulate an ArrayList using common techniques.'