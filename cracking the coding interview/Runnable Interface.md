In a MS, Google or Amazon interview, it`s not terribly common to be asked to implement an algo-rithm with threads (unless you`re working in a team for which this is a particularly important skill).
it is however, relatively common for interviewers at any company to assess your general understanding of threads, particularly your understanding of deadlocks.

***Threads in Java

Every thread in Java is created and controlled by a unique object of the java.lang.Thread class.When a standalone application is run, a user thread is automatically created to execute the main () method.
This thread is called the main thread.

In java, we can implement threads in one of two ways:

@@By Implementing tghe Java.lang.Runnable interface
@@By extending the java.lang.Thread class

We will cover both of these below.

Implementing the Runnable Interface

The Runnable interface has the follwing very simple structure.

```
  public interface Runnable {
    void run();
    }
 ```   
 To create and use a thread using this interface, we do the following:
 
 1.Create a class which implements the Runnable interface. An object of this class is a Runnable object.
 2.Create an object of type. Thread by passing a Runnable object as argument to the Thread constructor.
 3.Ther start() method is invoked on the Thread object created in the previous step.
 
 For example:
 
 ```
  public class RunnableThreadExample implements Runnable{
  
    public int count = 0;
    
    public void run() {
      System.out.println("RunnableThread starting.");
      
      try {
        while (count < 5) {
          Thread.sleep(500);
          count++;
          
         }
         
        }catch (InterruptedException exc){
        System.out.println("RunnableThread interrupted.");
        }
        
        System.out.println("RunnableThread interrupted.");
        }
       }
       
     public static void main (String[] args){
      RunnableThreadExample instance = new RunnableThreadExample();
      Thread thread = new Thread(instance);
      thread.start();
      
      while(instance.count !=5){
        try{
        Thread.sleep(250);
        }catch (InterruptedException exc){
        exc.prinStackTrace();
        }
       }
      }
