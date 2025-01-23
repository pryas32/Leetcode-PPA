import java.math.BigInteger;
import java.util.Scanner;

public class FACTORIZATION {

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();


        BigInteger ans=new BigInteger("1");


        for(int i=1;i<=n;i++){
           BigInteger b=BigInteger.valueOf(i);
    ans=ans.multiply(b);
        }
System.out.println(ans);

//factorial using BigInteger



    }





}
