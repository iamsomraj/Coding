#include<stdio.h>

typedef struct node {
    int data;
    struct node *next;
} Node;

Node *head = NULL;

Node* create() {
    printf("\nEnter the data for the node: \n");
    int data;
    scanf("%d",&data);
    Node* new = (Node*)malloc(sizeof(Node));
    new->data = data;
    new->next = NULL;
    printf("\nThe data %d is pushed as Node!\n",new->data);
    return new;
}

void push(Node**);
void pop(Node**);
void display(Node*);



int main() {
    int ch;
    do {

        printf("\nEnter the choice:\n1.Push\n2.Pop\n3.Display\n4.Exit\n");
        scanf("%d",&ch);
        switch(ch) {

        case 1:
            push(&head);
            break;
        case 2:
            pop(&head);
            break;
        case 3:
            display(head);
            break;
        case 4:
            ch = 5;
            break;
        default:
            printf("\nWrong choice!\n");
            break;
        }

    } while(ch!=5);
}
void push(Node** head) {
    Node* new = create();
    new->next = *head;
    *head = new;
}
void pop(Node** head) {
    if ( *head == NULL ) {
        printf("\nLinked List is empty!\n");
    } else {
        Node *pointer = *head;
        printf("\nThe Node with data %d is popped!\n",pointer->data);
        pointer = pointer->next;
        *head = pointer;
    }
}

void display(Node* head) {
    if ( head == NULL ) {
        printf("\nLinked List is empty!\n");
    } else {
        Node *pointer = head;
        printf("\nLinked list is displayed : \n");
        while( pointer != NULL ) {
            printf("\n\t%d\t",pointer->data);
            pointer = pointer->next;
        }
    }
}
