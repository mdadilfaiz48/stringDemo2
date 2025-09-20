 final class Test3 {

    private int i;
    Test3(int i){
        this.i = this.i;
    }
     public Test3 modify(int i){
          if(this.i == i){
              return this;
          }
          else{
              return new Test3(i);
          }
       }
       // creation of our own Immutable class.

    public static void main(String[] args) {
        Test3 t1 = new Test3(10);
        Test3 t2 = t1.modify(100);
        Test3 t3 = t1.modify(10);
        System.out.println(t1 == t2);
        System.out.println(t1 == t3);

    }

}
