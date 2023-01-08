import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*  Задание 3
Подсчитать среднюю длину слова, во введенном с клавиатуры предложении.


        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String line = scanner.nextLine();
        String[] mass = line.split(" ");
        float d = 0;
       for(String s: mass){
           d=d+s.length();
       }
       float dou = mass.length;
       float res = (d/dou);
        System.out.println("Средняя длина слова " + res);

 */

        /*
        Задание 7
            Пользователь вводит с клавиатуры любую строку. Поменять в исходной строке все большие буквы на маленькие,
            а маленькие  - на большие. Если в строке присутствуют цифры, заменить на символ подчеркивания и вывести
            результат на консоль.

         */


/*
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку ");
        String str = scanner.nextLine();
        char[] chars = str.toCharArray();

        String s = "";
        s=s.replaceAll("[0-9]+", "__");

        for (int i = 0; i < chars.length; i++) {

                char c = chars[i];
                s=str.replaceAll("[0-9]+", "--");

                if (Character.isUpperCase(c)) {
                    chars[i] = Character.toLowerCase(c);
                } else if (Character.isLowerCase(c)) {
                    chars[i] = Character.toUpperCase(c);
                }
     }


        System.out.println(s);

 */

        /*
        Задание 4.
        Ввести с клавиатуры (латиницей). Из введеной строки выбрать все слова, начинающиеся на гласные буквы и
        заканчивающиеся на согласные. Вывести отобранные слова на консоль.
        */

        /*
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку из слов");
        String st = scanner.nextLine();
        char[] chars = st.toCharArray();
        char ch;
        for (int i = 0; i < chars.length; i++) {
            ch = chars[i];
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'y') {
                System.out.println("Гласные буквы " + ch);
            }
        }
            for (int j = 0; j < chars.length; j++) {
                ch = chars[j];
                if (ch == 'q' || ch == 'w' || ch == 'r' || ch == 't' || ch == 'p' || ch == 's' || ch == 'd' ||
                        ch == 'f' || ch == 'g' || ch == 'h' || ch == 'j' || ch == 'k' || ch == 'l' || ch == 'z' ||
                        ch == 'x' || ch == 'c' || ch == 'v' || ch == 'b' || ch == 'n' || ch == 'm') {
                    System.out.println("Согласные " + ch);

                }

            }

         */

        /*
        Задание 2
Написать программу, которая создаст строку, в которой находятся все целые числа, начиная с 1, выписаны в одну
строку «123456789101112131415...». Строка должна быть длиной не более 1 000 символов.
По числу n (введенного с клавиатуры), выведите цифру на n-й позиции (используется нумерация с 1).
         */

        /*
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите номер позиции (1 - 1000) ");
        int position = scanner.nextInt();
        scanner.close();

        String stroka = "";
        String stroka1k = "";

        for (int i = 1; stroka.length() < 1000; i++) {
            stroka = stroka + String.valueOf(i);
        }
        for (int i = 0; i <= 999; i++) {
            stroka1k = stroka1k + String.valueOf(stroka.charAt(i));
        }
        System.out.println("На позиции " + position + " находится цифра " + stroka1k.charAt(position - 1));
         */

        /*

       Задание 1
       Ввести с клавиатуры строку текста, а затем один символ.Показать на консоль индексы и количество совпадений
       (ищем вхождения символа в строку). В случае если совпадений ненайдено, вывести соответствующий текст
        */

        /*
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Введиете строку текста");
        String text = sc.nextLine();
        System.out.println("Введите символ ");
        char ch = sc2.next().charAt(0);
        int count = 0;
        int a = -1;

        int index = text.indexOf(ch);
        while (index != -1) {
            System.out.println("Индекс данной буквы " + index);
            index = text.indexOf(ch, index + 1);
            a = index;
            count++;
        }
        if (count > a) {
            System.out.print("Количество совпадений= " + count);
        } else {
            System.out.println("Совпадений нет");
        }

         */

//}

//}
    }
}