Overloading vs. Overriding

Overloading is term used to describe when two methods have the same name but differ in the type or number of arguments.

```
public dobule computerArea(Circle c) {...}
public dobule computerArea(Square s) {...}

```

Overriding, however, occurs when a method shares the same name and function signature as another method in its super class.
```
public abstract class Shape {
  public void printMe() {
    System.out.println(" I am a shape.");
    }
    public abstract double computerArea();
  }
  
public calss Circle extends Shape {
  private double rad = 5;
  public void printMe() {
    System.out.println(" I am a circle.");
   }
   
   public double computeArea() {
   return rad * rad * 3.15;
  }
}

public class Ambiguous extends Shape {
  private double area = 10;
  public double computerArea(){
    reuturn area;
    
  }
}

public class IntroductionOverriding{
  public static void main(String[] args) {
    Shape[] shapes = new Shape[2];
    Circle circle = new Circle();
    Ambiguous ambiguous = new Ambiguous();
    
    shapes[0] = circle;
    shapes[1] = ambiguous;
    
    for (Shape s : shapes) {
      s.printMe();
      System.out.println(s.computeArea());
     }
   }
 }
 
 ```
 
 The above code will print;
 1.I am a circle.
 2. 78.75
 3. i am a shape.
 4. 10.0
 
 Observe that Circle overrode printMe(), whereas Ambiguous just left this method as-is.
