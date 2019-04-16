package task3_2;
import java.util.*;
public class IsSeven {
    //проверка последней цифры числв на "7"
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);//
        System.out.print("Введите число, требующие спроверки последней цифры: ");
        int i = Integer.parseInt(reader.nextLine());//сохраняем введенное число в переменную
        if(i%10==7){//берем остаток от деления на 10, что и есть последняя цифра целого числа
            System.out.println("Введенное число оканчивается на 7: "+ i);
        } else {System.out.println("Введенное число не оканчивается на 7: "+ i);}

    }
}
