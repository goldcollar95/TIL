//흩어진 코드들을 한곳으로 모으는 것을 말함.

class A {
  method a () {
          AAAA
    오늘은 5월 1일입니다.
          BBBB
    }
  
  method b () {
          AAAA
    내일은 5월 2일입니다.
          BBBB
    }
}
  class B {
    method c() {
          AAAA
    내일 모레는 5월 3일입니다.
          BBBB
            
  }
}

  class AAAABBBB {
      method aaaabbbb(joinpoint point) {
        AAAA
        point.execute()
          
    }
  }
