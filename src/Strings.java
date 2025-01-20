public class Strings {

    public static void main(String args[]) {

        //String ->its a sequence of character
        char ch[] = {'s', 'a', 'r'};

        for (int i = 0; i < ch.length; i++)
            System.out.println(ch[i]);

//
        String str = "abc";
        String str1 = "abc";
      //  str1 = str1.concat("ok");

        System.out.println(str1);
        System.out.println(str);


        if (str == str1) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
System.out.println("2");
//String is known for its immutability whereas its also thread safe.

//StringBuffer ->its a thread safe and is used in multithreaded env
        //StringBuilder->its a thread safe and is used in single threaded env.
        //they both are mutable

        String str2 = "abc";
        String str3 = "tab";

        if (str2.contains(str3)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

        if (str2.equals(str3)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

        int x=str2.indexOf("abc");
//            System.out.println("yes");
//        } else {
//            System.out.println("no");
//        }

        System.out.println(str2.toLowerCase());
        System.out.println(str2.toUpperCase());
//        System.out.println(str2.capitalize());


        //StringBuffer->mutable


        StringBuffer str6=new StringBuffer("okgoogle");
        StringBuffer str7=new StringBuffer("okgoogle");
        if (str6 == str7) {

            System.out.println("yes");
        }



str7=str6;
        str7.append("abc");
        if(str7==str6){
            System.out.println("same");
        }








    }
}