class Node:
    def __init__(self, data):
        self.data = data
        self.next = None

    def __str__(self):
        return "\nNode value: %d" % self.data


def create():
    data = int(input("\nEnter the data for the node: \n"))
    node = Node(data)
    return node


class LinkedList:
    head = None

    def push(self):
        newNode = create()
        if self.head is None:
            self.head = newNode
        else:
            newNode.next = self.head
            self.head = newNode

    def pop(self):
        if self.head is None:
            print("\nThe list is empty!\n")
        else:
            data = self.head.data
            print("\nThe node with data %d is popped!\n" % data)
            self.head = self.head.next

    def display(self):
        if self.head is None:
            print("\nThe list is empty!\n")
        else:
            print("\nThe List is displayed!\n")
            ptr = self.head
            while ptr is not None:
                print(ptr)
                ptr = ptr.next


linkedList = LinkedList()
ch = int(input("\nEnter Choice:\n1.Push\n2.Pop\n3.Display\n4.Exit\n"))
while ch != 4:
    if ch == 1:
        linkedList.push()
    elif ch == 2:
        linkedList.pop()
    elif ch == 3:
        linkedList.display()
    elif ch == 4:
        exit(31)
    ch = int(input("\nEnter Choice:\n1.Push\n2.Pop\n3.Display\n4.Exit\n"))
