class Node {
  int data;
  Node next;

  Node(int data) {
    this.data = data;
    this.next = null;
  }

  @Override
  public String toString() {
    return "Node value : " + this.data;
  }
}

class Queue {
  int length = 0;
  int max = 5;
  Node front;
  Node rear;

  Queue(int data) {
    // new node created
    Node newNode = new Node(data);
    System.out.println("Queue : Enqueue : " + data);
    // front and rear points to the same node
    this.front = newNode;
    this.rear = newNode;
    this.length++;
  }

  void enqueue(int data) {
    if (this.length == max) {
      System.out.println("Queue : Overflow");
      return;
    }

    // insert at rear end
    Node newNode = new Node(data);
    System.out.println("Queue : Enqueue : " + data);
    this.rear.next = newNode;
    this.rear = newNode;
    this.length++;
  }

  void dequeue() {
    if (this.length == 0) {
      System.out.println("Queue : Underflow");
      return;
    }

    // deletes at front end
    System.out.println("Queue : Dequeue : " + this.front.data);
    this.front = this.front.next;
    this.length--;
  }

}

class Main {
  public static void main(String args[]) {
    Queue queue = new Queue(10);
    queue.enqueue(15);
    queue.enqueue(25);
    queue.enqueue(35);
    queue.enqueue(45);
    queue.enqueue(35);

    queue.dequeue();
    queue.dequeue();
    queue.dequeue();
    queue.dequeue();
    queue.dequeue();
    queue.dequeue();

  }
}

// Queue : Enqueue : 10
// Queue : Enqueue : 15
// Queue : Enqueue : 25
// Queue : Enqueue : 35
// Queue : Enqueue : 45
// Queue : Overflow
// Queue : Dequeue : 10
// Queue : Dequeue : 15
// Queue : Dequeue : 25
// Queue : Dequeue : 35
// Queue : Dequeue : 45
// Queue : Underflow