---

# `Tree` Class Documentation
## (The `TreeLinkedList.java` is only a Helper Class. Main class is `Tree.java`.)

### Overview:

The `Tree` class is used to create and manipulate an N-ary tree, where each node in the tree can have any number of children. Each node holds a string value (`data`), and its children are stored in a linked list. You can think of it as a tree where each node can have multiple branches (children), and you can add, delete, or retrieve nodes easily.

### Key Concepts:
- **Root**: The starting node of the tree.
- **Node**: Each item in the tree that holds a value and can have children.
- **Children**: The nodes connected directly beneath a node (its "branches").

### Class Variables:
- `data`: Stores the value of the current node (a `String`).
- `nodes`: Stores the children of the current node as a linked list (`TreeLinkedList`).
- `length`: Keeps track of the number of child nodes.

### Constructor Methods:

#### `Tree(String root)`
- **Description**: Creates a new `Tree` with a given value for the root.
- **Parameters**: 
  - `root`: A string representing the value for the root node.
- **Usage**: 
  ```java
  Tree tree = new Tree("RootValue");
  ```
  This will create a new tree where the root node holds the value `"RootValue"`.

#### `Tree()`
- **Description**: Creates a new `Tree` with an empty value (root node is an empty string).
- **Usage**: 
  ```java
  Tree tree = new Tree();
  ```
  This will create a new tree where the root node has no value initially.

### Main Methods:

#### `void add(String v)`
- **Description**: Adds a new child node to the current tree node. The new child is added as the last child.
- **Parameters**: 
  - `v`: A string value representing the data for the new child node.
- **Usage**: 
  ```java
  tree.add("ChildValue");
  ```
  This adds a new node with the value `"ChildValue"` as a child of the current node. If the current node has other children, the new child will be added to the end.

#### `void push(String v)`
- **Description**: Adds a new child node to the beginning of the child list for the current node.
- **Parameters**: 
  - `v`: A string value representing the data for the new child node.
- **Usage**: 
  ```java
  tree.push("ChildValue");
  ```
  This adds a new node with the value `"ChildValue"` as the first child of the current node. Any existing children will be pushed back.

#### `Tree get(int index)`
- **Description**: Retrieves the child node at a given index.
- **Parameters**: 
  - `index`: The position of the child node you want to get (starting from 0).
- **Returns**: The child node at the specified index or `null` if the index is out of bounds.
- **Usage**: 
  ```java
  Tree childNode = tree.get(0);
  ```
  This returns the first child of the current node. If the index is invalid (e.g., there are fewer children than the index requested), it will return `null`.

#### `void delete(int index)`
- **Description**: Deletes the child node at the specified index.
- **Parameters**: 
  - `index`: The position of the child node you want to delete (starting from 0).
- **Usage**: 
  ```java
  tree.delete(2);
  ```
  This deletes the child node at position `2`. After deletion, the remaining nodes shift to fill the gap.

#### `void deleteFirst()`
- **Description**: Deletes the first child node of the current node.
- **Usage**: 
  ```java
  tree.deleteFirst();
  ```
  This removes the first child node from the current node.

#### `void deleteLast()`
- **Description**: Deletes the last child node of the current node.
- **Usage**: 
  ```java
  tree.deleteLast();
  ```
  This removes the last child node from the current node.

#### `void printAll()`
- **Description**: Prints the entire tree in a JSON-like format, starting from the current node. It prints the value of the current node, followed by its child nodes recursively.
- **Usage**: 
  ```java
  tree.printAll();
  ```
  This will print the tree structure in a readable format. For example:
  ```
  {
    "value": "Root",
    "nodes": [
      {
        "value": "Child1",
        "nodes": []
      },
      {
        "value": "Child2",
        "nodes": []
      }
    ]
  }
  ```

### Example Usage:
```java
public class TestTree {
    public static void main(String[] args) {
        Tree tree = new Tree("Root");

        // Add child nodes
        tree.add("Child1");
        tree.add("Child2");

        // Add a node to the beginning
        tree.push("Child0");

        // Get a specific child node and add children to it
        tree.get(1).add("GrandChild1");
        tree.get(1).add("GrandChild2");

        // Print the entire tree structure
        tree.printAll();
    }
}
```
**Output:**
```
{
"value": "Root",
"nodes": [
{
"value": "Child0",
"nodes": []
},
{
"value": "Child1",
"nodes": [
{
"value": "GrandChild1",
"nodes": []
},
{
"value": "GrandChild2",
"nodes": []
}
]
},
{
"value": "Child2",
"nodes": []
}
]
}
```
(Indentation is not yet supported, but I would love any changes. Feel free to e-mail me at `nihalg2006@gmail.com`)
### Summary:
- **Tree** is a class that allows you to create a flexible tree structure where each node can have many children.
- You can add, retrieve, and delete nodes, and print the structure of the tree in a JSON-like format.
- This class is suitable for various applications, such as representing hierarchical data like file systems, organizational charts, and more.

---
