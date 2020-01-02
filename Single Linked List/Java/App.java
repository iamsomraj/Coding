import java.util.*;

class Node {
  int data;
  Node next;

  Node(int data) {
    this.data = data;
    this.next = null;
  }

  public String toString() {
    return "\nNode Value:\t"+this.data;
  }

}

class LinkedList {

  Node head;

  public static Node create() {
    Scanner sc = new Scanner(System.in);
    int data;
    System.out.println("Enter the data for the node: ");
    data = sc.nextInt();
    Node node = new Node(data);
    return node;
  }

  public void push() {
    if ( this.head == null ) {
      this.head = create();
    } else {
      Node newNode = create();
      newNode.next = this.head;
      this.head = newNode;
    }
  }

  public void pop() {
    if (this.head == null) {
      System.out.println("The Linked list is empty!");
    } else {
      int data = this.head.data;
      System.out.println("The data popped out of the list is: " + data);
      this.head = this.head.next;
    }
  }

  public void display() {
    if (this.head == null) {
      System.out.println("The Linked List is empty!");
    } else {
      Node newNode = this.head;
      Node copyHead = this.head;
      System.out.println("The Linked List is printed: ");
      while (newNode != null) {
        System.out.println(newNode);
        newNode = newNode.next;
      }
      this.head = copyHead;
    }
  }

}

/**
 * App
 */
public class App {

  public static void main(String[] args) {
    int ch;
    Scanner sc = new Scanner(System.in);
    LinkedList list = new LinkedList();

    do {
      System.out.println("\nEnter the choice:\n1.Push\n2.Pop\n3.Display\n4.Exit\n");
      ch = sc.nextInt();
      switch (ch) {
      case 1:
        list.push();
        break;
      case 2:
        list.pop();
        break;
      case 3:
        list.display();
        break;
      case 4:
        System.exit(31);
        break;
      default:
        System.out.println("Wrong input By the User: ");
        break;

      }

    } while (ch != 4);
  }
}