package task3_3_2;

import java.util.Scanner;

public class Rectangle_Circle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter length a: ");
        int a = Integer.parseInt(in.nextLine());
        System.out.println("enter width b: ");
        int b = Integer.parseInt(in.nextLine());
        System.out.println("enter radius r: ");
        int r = Integer.parseInt(in.nextLine());

        if(Math.sqrt(a*a + b*b)<r*2){
            System.out.println("A circle of radius "+r+" can close the hole");

        } else {
            System.out.println("A circle of radius "+r+" can't close the hole");
        }


    }
}
