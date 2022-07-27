Add the Runtimes:O(A+B)
for (int a : arrA){
  print(a);
}

for (int b : arrB) {
  print(b);
 }
 
 -------------------------
 
 Multply the Runtimes:
 for (int a :arrA) {
    for (int b : arr B) {
        print(a + "," + b);
       }
    }
    
    
* in the example on the left, we do A chunks of work then B chunks of work. Therefore, the total amount of work is O(A+B).

* in the example on the right, we do B chunks of work for each element in A. Therefore, the total amount of work is O(A*B).

다른 말로 A+B에 속한 알고리즘은 when you`re all done, 즉 한 부분이 끝나야 다음 런타임을 더할수 있으며
A*B 동시다발적인 개념이다.
