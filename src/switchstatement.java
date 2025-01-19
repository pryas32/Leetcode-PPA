public class switchstatement {

    //when to use switch statement->when there is a fixed variable and it has multiple branches
    public static void main(String args[]) {


        // int a=23;
//char a='L';
//
//    switch (a){ // or we can use char or string here.
//        case 'A':
//            System.out.print("hello ");
//            break;
//        case 'L':
//            System.out.print("hello world ");
//            break;
//        default:
//            System.out.print("nothing matches");

        int a = 5;

        switch (a++) {
            case 5:
                System.out.println("First");
                System.out.print(a);
            case 6:
                System.out.println(a++);
                break;
            case 7:
                System.out.println("YES");
        }
    }
}
