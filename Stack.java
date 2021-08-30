
class Stack{
  Node top=null;
  public static void main(String args[])
  {
    Stack s = new Stack();
    s.push(45);
    s.push(96);
    s.push(455);
    s.push(99);
    s.push(122);
    s.display();
    s.peek();
    s.pop();
    s.pop();
    s.display();
  }
  public boolean isempty()
  {
    if(top==null)
      return true;
    return false;
  }
  public void push(int x)
  {
    Node newn=new Node(x);
    if(isempty())
      top=newn;
    else
    {
      newn.next=top;
      top=newn;
    }
  }
  public void pop()
  {
    Node temp = top;
    System.out.printf("the element poped out is %d\n",top.data);
    top=temp.next;
  }
  public void peek()
  {
    System.out.printf("%d is at the top of the stack\n",top.data);
  }
  public void display()
  {
    Node temp = top;
    if(top==null)
      System.out.println("empty stack");
    else
    {
      while(temp!=null)
      {
        System.out.println(temp.data);
        temp=temp.next;
      }
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