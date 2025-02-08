import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class stream_example4 {
//    int roll;
//    String name;
//    int marks;
//
//
//    stream_example4(int a,String b,int c){
//        roll=a;
//        name=b;
//        marks=c;
//    }
//
//int getmarks(){
//        return marks;
//}
//
//    int getRoll(){
//        return roll;
//    }
//    String getnames(){
//        return name;
//    }
//
//public static void main(String args[]) {
//
//
//    stream_example4 student[] = {new stream_example4(10, "prayas", 13),
//            new stream_example4(10, "gupta", 63),
//            new stream_example4(10, "okgoogle", 34)};
//
//
//    double summation = Arrays.stream(student).mapToInt(x -> x.getmarks())//convert from non primitive to primitive
//            .average().getAsDouble();
//
//
//    System.out.println(summation);
//
////giving example of collect method how to collect or groupby streams
//
////like we want to collect in map
//
//    Map<Integer, String> arr;
//    arr = Arrays.stream(student).collect(Collectors.toMap(//giving refrence of key an value here
//            stream_example4::getmarks, stream_example4::getnames));
//
//    arr.forEach((marks, name) -> System.out.println("Marks: " + marks + ", Name: " + name));
//
//
//    //now using groupby
//
//
//    Map<Integer, List<stream_example4>> arraytest;
//    arraytest = Arrays.stream(student).collect(Collectors.groupingBy(stream_example4::getmarks));
//
//    arraytest.forEach((marks, names) -> System.out.println("Marks: " + marks + ", Names: " + names));
//
////for strings ,arrays as they dont implemnt stream so for makeing them as source we need to do
//    //as Arrays.Stream(String_name);
//    //Arrays.Stream(arrays);
//}
//    }
        }
