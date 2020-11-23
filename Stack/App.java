
class Node {
  int data;
  Node next;

  Node(int data) {

    this.data = data;
    this.next = null;

  }
}

class Stack {
  Node top;
  int length = 0;
  int max = 5;

  Stack(int data) {
    Node newNode = new Node(data);
    this.top = newNode;
    this.length++;
  }

  void push(int data) {
    if (this.length == max) {
      System.out.println("Overflow : Stack is full");
      return;
    } else {
      Node newNode = new Node(data);
      newNode.next = this.top;
      this.top = newNode;
      System.out.println("Data inserted : " + data);
      this.length++;

    }
  }

  void pop() {
    if (this.length == 0) {
      System.out.println("Underflow : Stack is empty");
      return;
    } else {
      int dataToBeDeleted = this.top.data;
      System.out.println("Data deleted : " + dataToBeDeleted);
      System.out.println();
      this.top = this.top.next;
      this.length--;
    }
  }

}

/**
 * App
 */
public class App {

  public static void main(String[] args) {
    Stack stack = new Stack(10);
    stack.push(20);
    stack.push(30);
    stack.pop();
    stack.pop();
    stack.pop();
    stack.pop();
  }
}