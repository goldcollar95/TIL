Threads within a given process share the same memory space, which is both a postive and a negative. it enable threads to share data, which can be valuable.
However, it also creates the opportunity for issue when two threads modify a resource at the same time. Java provides synchronization in order to control
access to shared resources.

They keyword synchroized and the lock form the basis for implementing synchronized execution of code.

Synchronized Methods

Most commonly, we restric access to shared resources through the use of the synchronized keyword. it can be applied to methods and code blocks, and restricts
multiple threads from executing the code simul-taneously on the same object.

To clarify the last point, consider the following code:


```java
public class MyClass extends Thread {
  private String name;
  pirvate MyObject  myObj;
  
  public MyClass(MyObject obj, String){
    name = n;     //Thread process in able area.
    myObj = obj;
}

  public void run() {
    myObj.foo(name);
   }
}

public class MyObject{
  public synchronized void foo(String name) {
      try{
        System.out.println("Thread" + name + ".foo(): string");
        Thread.sleep(3000);
        System.out.println("Thread" + name + ".foo(): ending");
        }catch (InterruptedException exc){
          System.out.println("Thread" + name + ": interrupted.");
        }
     }
  }
  
 ("=====================================================")
 
```


Can two instance of MyClass call foo at the same time? It depends. if they have the same instance of MyObject, then no. But, if they hold different
references, then answer is yes.



```java
/*Difference references - both threads can call MyObject.foo()*/
MyObject obj1 = new MyObject();
MyObject obj2 = new MyObject();
MyClass thread1 = new MyClass(obj1, "1");
MyClass thread2 = new MyClass(obj2, "2");
thread1.start();
thread2.start();

/*Same reference to obj. Only one will be allowed to call foo,
 * and the other will be forced to wait. */
 MyObject obj = new MyObject();
 MyClass thread1 = new MyClass(Obj, "1");
 MyClass thread2 = new MyClass(Obj, "2");
thread1.start();
thread2.start();

Static methods synchronize on the class lock. The two threads above could not simultaneously execute synchronized static methods on the same class,
even if one is calling foo and the other is calling bar. 

```java
public void run()
    if(name.equals("1")) MyObject.foo(name);
    else if (name.equals("2")) MyObject.bar(name);
    }
  }
  
public class MyObject {
    public static synchronized void foo(String name) {/*same as before*/}
    public static synchronized void bar(String name) {/*same as foo */}
  }
  
```

if you run this code, you will see the follwing printed:


```java
Thread 1.foo(): starting
Thread 1.foo(): ending
Thread 2.bar(): starting
Thread 2.bar(): ending

Synchronized Blocks
Similarly, a block of code can be synchronized. THis operates very simliarly to synchronizing a method.


```java
  public class MyClass exnteds Thread {
    public void run() { 
      myObj.foo(name);
    }
 }
 public class MyObject{
  public void foo(String name){
     synchronized(this){
    }
  }
} 

```

Like synchronizing a method, only one thread per instance of MyObject can execute the code wuithin the synchronized block.
That means that, if thread 1 and thread 2 have the same instance of MyObject, only one will be allowed to execute the code block at a time.

** Locks
For more granlar control, we can utilize a lock. A lock(or monitor)is used to synchronize access to a shared resource by associating the resource with the lock.
A thread gets access to a shared resource by first  acquiring the lock associated with the resource. At any given time, at most one thread can hold the lock
and, therefore,only one thread can access the shared resource.

A common use case for locks is when a resource is accessed from multiple places, but should be only accessed by one thread at a time. This case is demonstrated in the code below.


```java
public class LockedATM{
  private Lock lock;
  private int balance = 100; 
  
  public LockedATM(){
    lock = new ReentranLock();
   }
   
   public int withdraw(int value){
    lock.lock();
    int temp = balance;
    try{
      Thread.sleep(100);
      temp = temp - value;
      Thread.sleep(100);
      balance = temp;
     }catch (InterruptedException e){ }
      lock.unlock();
      return temp;
     }
     
     public int deposit(int value){
      lock.lock();
      int temp = balance;
      try{
        Thread.sleep(100);
        
        temp = temp + value;
        Thread.sleep(300);
        balance = temp;
        } catch (InterruptedException e){ }
        lock.unlock();
     }
  }
  
 ```
 
 Of coures, we've added code to intentionally slow down the execution of withdraw and deposit, as it helps to illustrate the potential problems that can occur.
 You may not write code exactly like this, but the situation it mirrors is very,very real.Using a lock will help protect a shared resource from being modified in unexpected ways.
 
 
    





