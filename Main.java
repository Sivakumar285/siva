struct node
{
  int data;
  struct node *next;
};

struct node *head;
struct node *one = NULL;
struct node *two = NULL;
struct node *three = NULL;
one = malloc(sizeof(struct node));
two = malloc(sizeof(struct node));
three = malloc(sizeof(struct node));
one->data = 1;
two->data = 2;
three->data=3;
one->next = two;
two->next = three;
three->next = NULL;
head = one;
class LinkedList {
  // Creating a node
  Node head;

  static class Node {
    int value;
    Node next;

    Node(int d) {
      value = d;
      next = null;
    }
  }

  public static void main(String[] args) {
    LinkedList linkedList = new LinkedList();

    // Assign value values
    linkedList.head = new Node(1);
    Node second = new Node(2);
    Node third = new Node(3);

    // Connect nodess
    linkedList.head.next = second;
    second.next = third;

    // printing node-value
    while (linkedList.head != null) {
      System.out.print(linkedList.head.value + " ");
      linkedList.head = linkedList.head.next;
    }
  }
}