import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*  ������� 3
���������� ������� ����� �����, �� ��������� � ���������� �����������.


        Scanner scanner = new Scanner(System.in);
        System.out.print("������� ������: ");
        String line = scanner.nextLine();
        String[] mass = line.split(" ");
        float d = 0;
       for(String s: mass){
           d=d+s.length();
       }
       float dou = mass.length;
       float res = (d/dou);
        System.out.println("������� ����� ����� " + res);

 */

        /*
        ������� 7
            ������������ ������ � ���������� ����� ������. �������� � �������� ������ ��� ������� ����� �� ���������,
            � ���������  - �� �������. ���� � ������ ������������ �����, �������� �� ������ ������������� � �������
            ��������� �� �������.

         */


/*
        Scanner scanner = new Scanner(System.in);
        System.out.println("������� ������ ");
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
        ������� 4.
        ������ � ���������� (���������). �� �������� ������ ������� ��� �����, ������������ �� ������� ����� �
        ��������������� �� ���������. ������� ���������� ����� �� �������.
        */

        /*
        Scanner scanner = new Scanner(System.in);
        System.out.println("������� ������ �� ����");
        String st = scanner.nextLine();
        char[] chars = st.toCharArray();
        char ch;
        for (int i = 0; i < chars.length; i++) {
            ch = chars[i];
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'y') {
                System.out.println("������� ����� " + ch);
            }
        }
            for (int j = 0; j < chars.length; j++) {
                ch = chars[j];
                if (ch == 'q' || ch == 'w' || ch == 'r' || ch == 't' || ch == 'p' || ch == 's' || ch == 'd' ||
                        ch == 'f' || ch == 'g' || ch == 'h' || ch == 'j' || ch == 'k' || ch == 'l' || ch == 'z' ||
                        ch == 'x' || ch == 'c' || ch == 'v' || ch == 'b' || ch == 'n' || ch == 'm') {
                    System.out.println("��������� " + ch);

                }

            }

         */

        /*
        ������� 2
�������� ���������, ������� ������� ������, � ������� ��������� ��� ����� �����, ������� � 1, �������� � ����
������ �123456789101112131415...�. ������ ������ ���� ������ �� ����� 1 000 ��������.
�� ����� n (���������� � ����������), �������� ����� �� n-� ������� (������������ ��������� � 1).
         */

        /*
        Scanner scanner = new Scanner(System.in);
        System.out.print("������� ����� ������� (1 - 1000) ");
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
        System.out.println("�� ������� " + position + " ��������� ����� " + stroka1k.charAt(position - 1));
         */

        /*

       ������� 1
       ������ � ���������� ������ ������, � ����� ���� ������.�������� �� ������� ������� � ���������� ����������
       (���� ��������� ������� � ������). � ������ ���� ���������� ���������, ������� ��������������� �����
        */

        /*
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        System.out.println("�������� ������ ������");
        String text = sc.nextLine();
        System.out.println("������� ������ ");
        char ch = sc2.next().charAt(0);
        int count = 0;
        int a = -1;

        int index = text.indexOf(ch);
        while (index != -1) {
            System.out.println("������ ������ ����� " + index);
            index = text.indexOf(ch, index + 1);
            a = index;
            count++;
        }
        if (count > a) {
            System.out.print("���������� ����������= " + count);
        } else {
            System.out.println("���������� ���");
        }

         */

//}

//}
    }
}