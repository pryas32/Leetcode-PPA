import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Arraycollectionmethod {


    public static void main(String args[]) {

        //equals has two version

        int arr[] = {1, 2, 3, 4};

        int arr1[] = {1, 2, 4, 3};

        System.out.println(Arrays.equals(arr, arr1));//it mathes content to content of an arrays

//other version included


        System.out.println(Arrays.equals(arr, 1, 4, arr1, 1, 4));


        String str[] = {"abc", "prayas"};
        String str1[] = {"abc", "prayas"};

        System.out.println(Arrays.equals(str, str1));


        System.out.println(Arrays.equals(str, 0, 1, str1, 0, 1));

        if (Arrays.equals(str, str1, String::compareToIgnoreCase)) {
            System.out.println("yes they are equals");
        } else {
            System.out.println("no they arent equals ");
        }


//mismatch ->if both of the arrays are equals then will return -1 if one is differnt from other then will return first
        //index of mismatch


        int aray[] = {1, 20, 3, 4};

        int arrau[] = {1, 2, 3, 4};

        System.out.println(Arrays.mismatch(aray, arrau));


        System.out.println("_____________________________________________");


        System.out.println(Arrays.mismatch(aray, 0, 2, arrau, 0, 2));


//mismatch fro non primitive type


        System.out.println(Arrays.mismatch(str, str1, String::compareToIgnoreCase));


        if (Arrays.compare(aray, arrau) > 0) {
            System.out.println("aray is greater than arrau");
        } else if ((Arrays.compare(aray, arrau) == 0)) {
            System.out.println("aray is equal than arrau");
        } else {
            System.out.println("aray is smaller than arrau");
        }


        Integer str2[] = {12, null, 41};
        Integer str3[] = {12, -1, 41};

        int res = Arrays.compare(str2, str3);


        if (res < 0) {
            System.out.println("a is smaller than b ");
        } else if (res > 0) {
            System.out.println("a is greater than b ");
        }


        String str5[] = {"12","hole hole" , "41"};
        String str4[] = {"12", "aakash", "41"};


System.out.println("_____________________________________________");
        if(Arrays.compare(str5,str4,String::compareToIgnoreCase)==0)
        {
            System.out.println("they are equals");
        }
       else if(Arrays.compare(str5,str4,String::compareToIgnoreCase)>0)
        {
            System.out.println("str5 greater than str4");
        }
        else {
            System.out.println("str4 greater ");
        }


//arrays.asList()

        //it create list over same array same .if we change array it will reflect in list and vice versa

        Integer hole[]={1,2,3,4};

        List<Integer> l=Arrays.asList(hole);

System.out.println(l);
//array to list conversion if we chahge arrray it will reflect in list adn vice versa
        hole[1]=34;

System.out.println(l);







    }



}
