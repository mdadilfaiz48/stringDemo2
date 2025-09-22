public class Test4 {

    public static void main(String[] args) {
//        final StringBuffer sb = new StringBuffer("durga");
//        sb.append("software");
//        System.out.println(sb);
//
//        String ta = "A";
//        ta = ta.concat("B");
//        String tb = "C";
//        ta = ta.concat("tb");
//        ta.replace('C','D');
//        ta = ta.concat(ta);
//        System.out.println(ta);
//
//        String str = " ";
//        str.trim();
//        System.out.println(str.equals("")+"_________"+str.isEmpty());
//
//        String s = "Helloworld hi";
//        s.trim();
//        int i = s.indexOf("d");
//        System.out.println(i);

    String s1 = "Java";
    String s2 = new String ("java");
        String s3 = s2;
       if(s1.equalsIgnoreCase(s2))
        {
            System.out.println("equals");
        }
        else{
               System.out.println("not equal");
        }

    }
}
