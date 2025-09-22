// You are given the head of a singly linked list. 
// You have to reverse the linked list and return the head of the reversed list.


class Node{
    int data;
    Node next;

    Node(int x)
    {
        data=x;
        next=null;
    }
}

public class reverseList{
    Node reverselist(Node head)
    {
        Node prev=null;
        Node next=null;
        Node current=head;

        while(current!=null)
        {
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;

        }
        return prev;
    }
}
