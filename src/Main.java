import java.lang.Math;
import java.util.Scanner;

public class Main {

    public static void out(String str) {
        System.out.print(str);
    }

    public static void outln(String str) {
        System.out.println(str);
    }



    public static void main(String[] args) {
        Storage storage = new Storage();//create object storage from Storage class
        Scanner scanner = new Scanner(System.in);//create object scanner for read x, eps, n

        out("Function 1/Math.sqrt(1 - Math.pow(x, 2))\n***************\nwrite x from -1 to 1: ");
        double x = scanner.nextDouble();   // 0 < x < |-1|
        out("Write E: ");
        double e = scanner.nextDouble();   //epsilon
        out("Write quantity  N, for sum: ");
        int n = scanner.nextInt();         // quantity of terms

        Solution.solution(x, e, n, storage);
        outln("***************");
        outln("The sum of N terms of the progression = " + storage.sumN);
        outln("The sum of terms -> eps = " + storage.sumE);
        outln("The sum of terms -> eps / 10 " + storage.sumE10);
        outln("Function value = " + (1/Math.sqrt(1 - Math.pow(x, 2))));
    }
}