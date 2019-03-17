class Emp
{
    int sal;
    String name;
    String post;

    public Emp(String name,int sal,String post)
    {
        this.name=name;
        this.sal=sal;
        this.post=post;
    }

    public void setname(String name)
    {
        this.name=name;
    }
    public String  getname()
    {
        return name;
    }


    public void setsal(int sal)
    {
        this.sal=sal;
    }
    public int getsal()
    {
        return sal;
    }


    public void setpost(String Post)
    {
        this.post=post;
    }
    public String getpost()
    {
        return post;
    }


    public String toString()
    {
        return name + " " +sal+ " " +post;
    }
}

class Node
{
    Node next;
    Emp data;
    public void setdata(Emp data)
    {
        this.data=data;
    }

    public Emp getdata()
    {
        return data;
    }

    public void setnext(Node next)
    {
        this.next=next;
    }

    public Node getnext()
    {
        return next;
    }
}

public class Nonpri {
    Node start=null;
    public boolean isempty()
    {
        return start==null;
    }

    public void insertfirst(Emp data)
    {
        Node n=new Node();

        if(isempty())
        {
            n.setdata(data);
             start=n;
        }

        else
        {
            n.setdata(data);
            n.setnext(start);
            start=n;
        }
   }

   public void insertlast(Emp data)
   {
       Node n=new Node();
       if(isempty())
       {
           n.setdata(data);
           start=n;
       }
       else
           {
               Node temp=start;
               while(temp.next!=null)
               {
                   temp=temp.getnext();
               }
               temp.next=n;
               n.setdata(data);
               n.setnext(null);

   }
   }

    public void display() {
        Node temp = start;
        if (isempty()) {
            System.out.println("list is empty");
        } else {
            while (temp!= null) {
                System.out.print(temp.getdata() + "-->");
                temp = temp.getnext();
            }
            System.out.println("null");
        }
    }


    /*public void deletefirst()
    {
        if(isempty())
        {
            System.out.println("lsit is empty");
        }
        else
        {
            Node temp=start;
            start=temp.next;
        }
    }*/


    public static void main(String[] args) {
        Emp e=new Emp("nancy",87000,"manager");
        Emp e1=new Emp("purvi",878890,"pa");
        Emp e2=new Emp("hareesh",878088,"ceo");
        Emp e3=new Emp("vivek",8700,"assi man");
        Emp e4=new Emp("yuvraj",87778,"staff");
        Emp e5=new Emp("naman",87008,"staff");

     Nonpri obj=new Nonpri();
     obj.insertfirst(e);
     obj.insertfirst(e1);
     obj.insertfirst(e2);
     obj.insertfirst(e3);
     obj.insertfirst(e4);
     obj.insertlast(e5);
     obj.display();
    }
}
