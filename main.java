import java.util.Scanner; // Импортируем Scanner для ввода переменных с клавиатуры

public class main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in); // 
        int X = in.nextInt();
        int A = in.nextInt();
        int B = in.nextInt();
        int C = in.nextInt();
        int D = in.nextInt(); // Вводим с клавиатуры числа X, A, B, C, D
        if (X<C){ // Разбиваем числовую прямую на части так, чтобы в одной части получилось 3 отрезка, а в другой 2
            if (X<B){ // Разбиваем часть с 3 отрезками на части, в одной из которых 2 отрезка, а в другой 1
                if (X<A){ // Разбиваем часть с 2 отрезками
                    System.out.println(1); // Выводим ответ
                }
                else {System.out.println(2);} // Выводим ответ
            }
            else {System.out.println(3);} // Выводим ответ
        }
        else { // Работаем с частью, в которой 2 отрезка
            if (X>D){  // Разбиваем часть, в которой 2 отрезка
                System.out.println(5);} // Выводим ответ
            else{
                System.out.println(4);} // Выводим ответ  
        }             
    }
}
