#include<stdio.h>
#include<stdlib.h>

typedef struct node
{
    int data;
    struct node *next;
}node;

node* create();


void insert(node **ptr);
void delete(node **ptr);
void display(node *ptr);
int dflag=0;
int main()
{
    node *head = NULL;
    int ch;
    
    do
    {
        printf("\n\n1.Insert\n2.Delete\n3.Display\n4.Exit\n\n");
        scanf("%d",&ch);
        switch(ch)
        {
            case 1:
                insert(&head);
                break;
            case 2:
                delete(&head);
                break;
            case 3:
                display(head);
                break;               
        }
    }while(ch!=4);
}

node* create()
{
    node* temp;
    temp = (node *)malloc(sizeof(node));
    printf("\n\nEnter the new element:\n\n");
    scanf("%d",&temp->data);
    temp->next= NULL;
    return temp;
}


void insert(node **ptr)
{        
    int ch;
   

    do
    {
        node *new, *t = *ptr;
        int value;
        printf("\n\n1.Insert At Begining\n2.Insert At Last\n3.Insert After A Value\n4.Insert Before A Value\n5.Exit\n\n");
        scanf("%d",&ch);
        switch(ch)
        {
            case 1:
                new = create();
                new->next = *ptr;
                *ptr = new;
                break;
            case 2:
                if((*ptr)==NULL)
                {
                    printf("\nLinked List is empty!\n");
                }
                else
                {
                    new = create();
                    while(t->next!=NULL)
                    {
                        t = t->next;
                    }
                    t->next = new;
                }

                break;
            case 3:
                
                if((*ptr)==NULL)
                {
                    printf("\nLinked List is empty!\n");
                }
                else
                {

                    printf("\n\nEnter the value after which the elements is going to get inserted:\n");
                    scanf("%d",&value);
                    
                    dflag = 0;
                    node *p;
                    p=t;
                    while(p->next!=NULL)
                    {
                        if(p->data==value)
                        {
                            dflag=1;
                            break;
                        }
                        p=p->next;
                    }
                    
                    if(dflag==1)
                    {
                                            new = create();

                            while(t->data!=value)
                    {
                        t = t->next;
                    }
                    new->next=t->next;
                    t->next=new;
                        
                        
                    }
                    else
                    {
                        printf("\n\nThe value %d cannot be found!\n\n",value);
                    }
                    
                    
                    
                    
              
                }

                break;
            case 4:
                
                if((*ptr)==NULL)
                {
                    printf("\nLinked List is empty!\n");
                }
                else
                {
                    printf("\nEnter the value before which you want to insert!\n");
                    scanf("%d",&value);
                    node *preptr;
                    preptr = t;
                    
                    
                                        dflag = 0;
                    node *p;
                    p=t;
                    while(p->next!=NULL)
                    {
                        if(p->data==value)
                        {
                            dflag=1;
                            break;
                        }
                        p=p->next;
                    }
                    
                    if(dflag==1)
                    {
                                            new = create();

                      
                                      while(t->data!=value)
                    {
                        preptr = t;
                        t=t->next;
                    }

                    preptr->next = new;
                    new->next =t;
                        
                    }
                    else
                    {
                        printf("\n\nThe value %d cannot be found!\n\n",value);
                    }
                    
                    
                    
      

                }
                
                
        }
    }while(ch!=5);

    
}


void delete(node **ptr)
{
    int ch;
    do
    {
        node *new, *t = *ptr;
        int value;
        printf("\n\n1.Delete At Begining\n2.Delete At Last\n3.Delete After A Value\n4.Delete Before A Value\n5.Exit\n\n");
        scanf("%d",&ch);
        switch(ch)
        {
            case 1:
                if((*ptr)==NULL)
                {
                    printf("\nLinked List is empty!\n");
                }
                else
                {

                     printf("\nThe element %d is now no longer available!\n",(*ptr)->data);
                     (*ptr)=(*ptr)->next;
                }
       
                break;
            case 2:
                if((*ptr)==NULL)
                {
                    printf("\nLinked List is empty!\n");
                }
                else
                {
                    node *preptr;
                    preptr = t;
                    while(t->next!=NULL)
                    {
                        preptr = t;
                        t = t->next;
                    }
                    
                    printf("\nThe element %d is now no longer available!\n",t->data);
                    t->next = NULL;
                    
                    
                    preptr->next=NULL;
                    
                   


                }
                
                
             
                break;
            case 3:
 

                if((*ptr)==NULL)
                {
                    printf("\nLinked List is empty!\n");
                }
                else
                {

                    printf("\n\nEnter the value after which the elements is going to get deleted:\n");
                    scanf("%d",&value);
                    
                                        dflag = 0;
                    node *p;
                    p=t;
                    while(p->next!=NULL)
                    {
                        if(p->data==value)
                        {
                            dflag=1;
                            break;
                        }
                        p=p->next;
                    }
                    
                    if(dflag==1)
                    {
                      
                        while(t->data!=value)
                    {
                        t = t->next;
                    }
                    
                              
                    printf("\nThe element %d is now no longer available!\n",t->next->data);
                    t->next=t->next->next;
                        
                    }
                    else
                    {
                        printf("\n\nThe value %d cannot be found!\n\n",value);
                    }
                    
                    

                    
                    
                }

                break;
            case 4:

                if((*ptr)==NULL)
                {
                    printf("\nLinked List is empty!\n");
                }
                else
                {
                    printf("\nEnter the value before which you want to delete!\n");
                    scanf("%d",&value);
                    node *preptr,*prepreptr;
                    preptr = t;
                    
                    dflag = 0;
                    node *p;
                    p=t;
                    while(p->next!=NULL)
                    {
                        if(p->data==value)
                        {
                            dflag=1;
                            break;
                        }
                        p=p->next;
                    }
                    
                    if(dflag==1)
                    {
                           while(t->data!=value)
                        {
                            prepreptr = preptr;
                            preptr = t;
                            t=t->next;
                        }

                        printf("\nThe element %d is now no longer available!\n",preptr->data);
                        prepreptr->next=t;

                    }
                    else
                    {
                        printf("\n\nThe value %d cannot be found!\n\n",value);
                    }
                 

                }


        }
    }while(ch!=5);


}



void display(node *ptr)
{
    

    if(ptr==NULL)
    {
        printf("\n\nUnderflow\n\n");
    }
    else
    {
        printf("\n\nElements are being displayed:\n\n");
        while(ptr!=NULL)
        {
            printf("%d  ",ptr->data);
            ptr=ptr->next;
        }
        
        
    }
    
    
    
}

