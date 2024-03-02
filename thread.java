class threadA extends Thread
  {
    public void run()
    {
      for(int i=0;i<=5;i++)
        {
          System.out.println("Thread A"+ -1*i);
        }
      System.out.println("Executing threadA");
    }
  }

class threadB extends Thread
  {
    public void run()
    {
      for(int i=0;i<=5;i++)
        {
          System.out.println("Thread B"+ 2*i);
        }
      System.out.println("Executing threadB");
    }
  }

class threadC extends Thread
  {
    public void run()
    {
      for(int i=0;i<=5;i++)
        {
          System.out.println("Thread C"+ 2*i-1);
        }
      System.out.println("Executing threadC");
    }
  }

class main
  {
    public static void main(String[], args)
    {
      threadA a = new threadA();
      threadB b = new threadB();
      threadC c = new threadC();

      a.start();
      b.start();
      c.start();
      
      
        
    }
  }
