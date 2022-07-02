Hopefully,all readers of this book are famillar with arrays and strings, so we wont bore you with such details. instead, we`ll focus on some of the more 
common techniques and issues with these data struc-tures.

pls note that array questions and string questions are often interchangeable. That is, a question that this book states using an array may be asked instead as a string question, and vice versa.

A hash table is a data structure that maps keys to values for highly efficient lookup. There are a number of ways of implementing this. Here, We will describe a simple but common implementation.

in this simple implementation, we use an array of linked lists and a hash code function. To insert a key(which might be a string or essentially any other data type)
and value, we do following:


* 1. First, compute `the key's hash code` which will usually be a int or long. Note that `two different keys` could have the same hash code, as there may be
* an infinite number of keys and a finite number of ints.

* 2. Then, map the hash code to an index in the array. This could be done with something like hash(key) % array_length. Two different hash codes could, of course, map to the same index.

* 3. At this index, there is a linked list of keys and values. Stroe the key and value in this index. We must use a linked list because of collisions: you could have two different keys with the same hash code, or two different
* hash codes that map to the same index

To retrieve the value pair by its key, you repeat this process. Comput the hash code from the key, and then compute the index from the hash code. Then, search through the linked list for the value with this key.

if the number of collisions is very high, `the worst case runtime is O(N)`, where N is the number of keys. However, we generally assume a good implementation that keeps collisions to a minium, in which ase the look time is O(1).<img width="563" alt="Screen Shot 2022-07-02 at 4 44 14 PM" src="https://user-images.githubusercontent.com/98082293/176991698-94aae012-0e94-449e-bad4-449f4961ae60.png">


Alternatively, we can implement ths hash table with a balanced binary search tree. This give us an O(log N) lookup time. The advantage of this is potentially
using less space, since we no longer allocate a large array. We can also iterate through the keys in order, which can be useful sometimes.


![Alt text](파일경로 "HashTables")
