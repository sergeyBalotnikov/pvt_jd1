package task3_4;

import java.util.Scanner;

public class Rubles {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the amount of rubles: ");
        int rub = Integer.parseInt(in.nextLine());
        int rub2 = rub%10;
        String s = "";
        if(rub2 == 1){
            s = "рубль";
        } else if (rub==2&&rub==3&&rub==4){
            s = "рубля";
        } else {
            s = "рублей";
        }
        System.out.println("У Вас "+rub+" "+s);
    }
}
