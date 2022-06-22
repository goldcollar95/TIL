Java`s collection framework is incredibly useful, and you will see it used throughout this book. Here are some of the most useful items.
ArrayList : An ArrayList is a dynamically resizing array, which grows as you insert elements.

```
ArrayList<String>my Arr = new ArrayList<String>();
myArr.add("one");
myArr.add("two");
System.out.println(myArr.get(0)); /* prints <one> */

```

Vector : A vector is very similar to an ArrayList, except that it is synchronized, its syntax is almost identical as well.
```
Vector<String> myVect = new Vector<String>();
myVect.add("one");
myVect.add("two");
System.out.println(myVect.get(0));
```
LinkedList: Linked is,of course, Java`s built-in LinkedList class. Though it rarely comes up in an interview, it`s useful to study because it demonstrates
some of the for an iterator

```LinkedList<String> myLinkedList = new LinkedList<String>();
myLinkedList.add("two");
myLinkedList.addFirst("one");
Iterator<String> iter = myLinkedList.iterator();
while(iter.hasNext()){
  System.out.prinln(iter.next());
  
}
```

HashMap: The HashMap collection is widely used, both in interviews and in the real world. We`ve provided a snippet of the syntax below.

```
HashMap<String, String> map = new HashMap<String, String>();
map.put("one", "uno");
map.put("two", "dos");
System.out.prinln(map.get("one"));
```
Before your interview, make sure you`re very comfortable with the above syntax. You`ll need it.
