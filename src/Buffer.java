public class Buffer {
    public static void main(String[] args) {

//        StringBuffer sb = new StringBuffer();
//        System.out.println(sb.capacity());
//        sb.append("abcdefghijklmnopq");
//        System.out.println(sb.capacity());
//
//         StringBuffer sb = new StringBuffer("durga");
//         System.out.println(sb.length());
//         System.out.println(sb.capacity());
//         System.out.println(sb.charAt(3));
////         System.out.println(sb.charAt(50));
//        sb.setCharAt(0,'m');
//        System.out.println(sb);

//        StringBuffer sb = new StringBuffer();
//        sb.append("adil");
//        sb.append("faiz");
//        sb.append(786);
//        sb.append(true);
//        System.out.println(sb);

//      StringBuffer sb = new StringBuffer("adil");
//      sb.insert(2,"xyz");
//      sb.insert(2,10.7);
//      sb.insert(2,true);
//      System.out.println(sb);


//        StringBuffer sb = new StringBuffer("abcdefgh");
//        sb.delete(2,5);
//        System.out.println(sb);

//        StringBuffer sb = new StringBuffer("durga");
//        sb.reverse();
//        System.out.println(sb);
//
//        StringBuffer sb = new StringBuffer("adil faiz");
//        sb.setLength(4);
//        System.out.println(sb);

//        StringBuffer sb = new StringBuffer();
//        System.out.println(sb.capacity());
//        sb.ensureCapacity(100);
//        System.out.println(sb.capacity());

//        StringBuffer sb = new StringBuffer(1000);
//        sb.append("abc");
//        System.out.println(sb.capacity());
//        sb.trimToSize();
//        System.out.println(sb.capacity());

        // method chain.
        StringBuilder sb = new StringBuilder();
        sb.append("durga").append("solution").reverse().insert(2,"xyz").delete(2,7);
        System.out.println(sb);
    }

}
