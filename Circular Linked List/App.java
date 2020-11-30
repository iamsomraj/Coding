class Node {
  int data;
  Node next;

  Node(int data) {
    this.data = data;
    this.next = null;
  }
}

class CLL {
  int length;
  Node head;
  Node tail;

  CLL(int data) {
    Node newNode = new Node(data);
    this.head = newNode;
    this.tail = newNode;
    this.length++;
  }

  void append(int data) {
    Node newNode = new Node(data);
    this.tail.next = newNode;
    newNode.next = this.head;
    this.tail = newNode;
    this.length++;
  }

  void prepend(int data) {
    Node newNode = new Node(data);
    newNode.next = this.head;
    this.head = newNode;
    this.tail.next = newNode;
    this.length++;
  }

  void display() {
    Node leader = this.head;
    do {
      System.out.println("Node value : " + leader.data);
      leader = leader.next;
    } while (leader != this.head);
  }

  void check() {
    Node leader = this.head;
    int iteration = 15;
    while (iteration != 0) {
      System.out.println("Node value : " + leader.data);
      leader = leader.next;
      iteration--;
    }

  }
}

class App {
  public static void main(String[] args) {
    CLL cll = new CLL(10);
    cll.append(20);
    cll.append(30);
    cll.append(40);
    cll.append(50);
    // cll.display();
    cll.check();
  }
}