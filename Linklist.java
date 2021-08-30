

class Linklist{
  Node head=null;
  public static void main(String args[])
  {
    Linklist ll=new Linklist();
    ll.insert(100);
    ll.insert(250);
    ll.insert(450);
    ll.display();
  }
  public void insert(int x)
  {
    Node newn = new Node(x);
    Node temp = head;
    if(head==null)
    {
      head=newn;
    }
    else
    {
      while(temp.next!=null)
      {
        temp=temp.next;
      }
      temp.next=newn;
    }
  }
  public void display()
  {
    Node temp = head;
    while(temp!=null)
    {
      System.out.println(temp.data);
      temp=temp.next;
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