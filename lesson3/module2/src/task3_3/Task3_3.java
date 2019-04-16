package task3_3;


import java.io.Console;

public class Task3_3 {
    /*public static void main(String[] args) {
        Console console = System.console();

        System.out.println("Enter number 1: ");
        String number1 = console.readLine();

        System.out.println("Enter number 2: ");
        String number2 = console.readLine();;

        int num1 = Integer.parseInt(number1);
        int num2 = Integer.parseInt(number2);

        int sum = num1 + num2;
        System.out.println("Total sum: " + sum);

    }*/
    public static void main(String[] args) {
        /*Console console = System.console();

        System.out.println("Enter number 1: ");
        String number1 = console.readLine();

        System.out.println("Enter number 2: ");
        String number2 = console.readLine();;

        int num1 = Integer.parseInt(number1);
        int num2 = Integer.parseInt(number2);

        int sum = num1 + num2;
        System.out.println("Total sum: " + sum);*/
        //System.out.println("input a: ");
        String s = "";
        Console cons = System.console();//получаем консоль
        int a = 0, b = 0, r = 0;
        if (cons != null) {//считываем данные с консоли
            s = cons.readLine("input a: ");
            a = Integer.parseInt(s);
            s = cons.readLine("input b: ");
            b = Integer.parseInt(s);
            s = cons.readLine("input r: ");
            r = Integer.parseInt(s);
        } else {
            System.out.println("Вы не ввели данные");
        }
        if (Math.sqrt(a * a + b * b) < 2 * r) {
            cons.printf("Картонка радиусом " + r + " закроет прямоугольное отверстие шириной " + a + " и высотой " + b);
        } else {
            cons.printf("Картонка радиусом " + r + " НЕ закроет прямоугольное отверстие шириной " + a + " и высотой " + b);
        }

        //System.out.println(a);


    }}
