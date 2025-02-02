import java.util.Arrays;
import java.util.Comparator;

public class student {  // Class name should be capitalized

    String name;
    int roll_no;

    student(String name, int roll_no) {
        this.name = name;
        this.roll_no = roll_no;
    }

    public String getName() {
        return this.name;
    }

    public int getRoll_no() {
        return this.roll_no;
    }

    // Override toString to make printing meaningful
    @Override
    public String toString() {
        return "{Name: " + name + ", Roll No: " + roll_no + "}";
    }

    public static void main(String args[]) {
        student arr[] = {
                new student("aakash", 12),
                new student("aakash", 13),
                new student("aakash", 10)
        };

        Arrays.sort(arr, Comparator.comparing(student::getName)
                .thenComparing(student::getRoll_no));

        System.out.println(Arrays.toString(arr));  // Use println instead of printf for arrays
    }
}
