

class Queue{
  Node front=null;
  Node rear = null;
  public static void main(String[] args) {
    Queue q = new Queue();
    q.enque(150);
    q.enque(159);
    q.enque(185);
    q.enque(170);
    q.display();
    q.dequeue();
    q.dequeue();
    q.display();
  }
  public boolean isempty()
  {
    if(front==null)
      return true;
    return false;
  }
  public void display()
  {
    Node temp=front;
    if(isempty())
      System.out.println("nothing to display");
    else
    {
      while(temp != null)
      {
        System.out.printf("%d ",temp.data);
        temp=temp.next;
      }
      System.out.println();
    }
  }
  public void enque(int x){
    Node newn = new Node(x);
    if(isempty())
    {
      front=newn;
      rear=newn;
    }
    else
    {
      rear.next=newn;
      rear=newn;
    }
  }
  public void dequeue()
  {
    if(isempty())
      System.out.println("nothing to dequeue");
    else
      {
        System.out.printf("number dequeued is %d\n",front.data);
        front=front.next;
      }
  }
}
class Node{
  int data;
  Node next;
  public Node(int x)
  {
    this.data=x;
    this.next=null;
  }
}