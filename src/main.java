import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner name_scaner = new Scanner(System.in);
        System.out.println("Введите номер задачи, которую нужно воспроизвести ");
        String number_task = name_scaner.nextLine(); // номер задачи
        int i = Integer.parseInt(number_task);

        int value;
        switch (i) {
            case 3:
                //Создание и запуск простой программы
                Task_3 myClassObject_3 = new Task_3();
                myClassObject_3.Task_3_FancyMethod();
                break;
            case 4:
                // Ввести с консоли число в бинарном формате. Перевести его в десятичный формат, записать в переменную int и вывести на экран.
                Task_4 myClassObject_4 = new Task_4();
                myClassObject_4.Task_4_myFancyMethod();
                break;
            case 5:
                //Необходимо вывести на экран таблицу умножения от 1 до 10 для введённого пользователем любого числа. Использовать циклы запрещено.
                Task_5 myClassObject_5 = new Task_5();
                myClassObject_5.Task_5_myFancyMethod();
                break;
            case 6:
                /*Написать программу, которая будет выполнять следующие действия:
                1. Ввод трех чисел с клавиатуры x, y, z
                2. Нахождение и вывод на экран среднего арифметического чисел x, y, z
                3. Деление среднего арифметического на 2 без остатка
                4. Если полученное число больше 3, то вывести на экран сообщение "Программа выполнена корректно"*/
                Task_6 myClassObject_6 = new Task_6();
                myClassObject_6.Task_6_FancyMethod();
                break;
            case 7:
                //Необходимо написать программу, где бы пользователю предлагалось ввести с клавиатуры число в переменную number.
                // В программе должны присутствовать константы X, Y, Z.
                // Программа должна сравнивать введенное значение с клавиатуры со значением констант и вывести на экран сообщение
                // "Данное значение имеется в константах" если number=X или Y или Z.
                // Если переменная отличается от констант, нужно вывести оповещение "Такой константы нет!"
                Task_7 myClassObject_7 = new Task_7();
                myClassObject_7.Task_7_myFancyMethod();
                break;
            case 8:
                //Необходимо с помощью цикла вывести на экран числа от 1 до 50.
                Task_8 myClassObject_8 = new Task_8();
                myClassObject_8.Task_8_myFancyMethod();
                break;
            case 9:
                //Произведите ввод данных с клавиатуры в массив, а после этого произведите вывод массива на экран, где каждый элемент массива умножается на 2.
                // Размер массива задается пользователем.
                Task_9 myClassObject_9 = new Task_9();
                myClassObject_9.Task_9_myFancyMethod();
                break;
            case 10:
                //Произведите ввод данных с клавиатуры в матрицу, а после этого произведите вывод первой строки матрицы на экран, где каждый элемент умножается на 3.
                // Размерность матрицы задается пользователем.
                Task_10 myClassObject_10 = new Task_10();
                myClassObject_10.Task_10_myFancyMethod();
                break;
            case 11:
                //Необходимо произвести ввод строки с клавиатуры и записать в строковую переменную.
                // Результат вывести на экран.
                Task_11 myClassObject_11 = new Task_11();
                myClassObject_11.Task_11_myFancyMethod();
                break;
            case 12:
                //Для введенной с клавиатуры строки необходимо провести отсев пробелов.
                // Результат в виде строки без пробелов вывести на экран.
                Task_12 myClassObject_12 = new Task_12();
                myClassObject_12.Task_12_myFancyMethod();
                break;
            case 13:
                //Необходимо провести сравнение длины двух строк, которые были введены с клавиатуры и записаны в соответствующие переменные.
                // Вывести на экран строку с наибольшей длиной. Если длины равны, вывести соответствующее сообщение.
                Task_13 myClassObject_13 = new Task_13();
                myClassObject_13.Task_13_myFancyMethod();
                break;
            case 14:
                /*Необходимо написать программу, которая будет реализовывать следующие действия:
                1. Ввод числа с клавиатуры и запись его в строковую переменную S
                2. Конвертация строковой переменной S в числовую переменную X типа int
                3. Конвертация числа X типа int в число Y типа double
                Все три числа разных типов необходимо в столбик вывести на экран*/
                Task_14 myClassObject_14 = new Task_14();
                myClassObject_14.Task_14_myFancyMethod();
                break;
            case 15:
                //Написать программу сортировки по возрастанию заданного пользователем массива чисел.
                //Использовать пузырьковый метод сортировки.
                Task_15 myClassObject_15 = new Task_15();
                myClassObject_15.Task_15_myFancyMethod();
                break;
            case 16:
                //Необходимо написать программу, которая будет выводить на экран текстовые данные из файла .txt
                Task_16 myClassObject_16 = new Task_16();
                myClassObject_16.Task_16_myFancyMethod();
                break;
            case 17:
                Task_17 myClassObject_17 = new Task_17();
                myClassObject_17.Task_17_myFancyMethod();
                break;
            case 18:
                Task_18 myClassObject_18 = new Task_18();
                myClassObject_18.Task_18_myFancyMethod();
                break;
            case 19:
                //Ввести с консоли число в бинарном формате. Перевести его в десятичный формат, записать в переменную int и вывести на экран.
                // Необходимо использовать циклы, нельзя использования готовые методы языка Java, для перевода числа из одной системы счисления в другую.
                Big_task_1 myClassObject_ВIG_1 = new Big_task_1();
                myClassObject_ВIG_1.Big_task_1_myFancyMethod();
                break;
            case 20:
                Big_task_2 myClassObject_ВIG_2 = new Big_task_2();
                myClassObject_ВIG_2.Big_task_2_myFancyMethod();
                break;
            case 21:
                //Напишите программу конвертер валют. Программа должна переводить рубли в доллары по текущему курсу.
                // Пользователь вводит текущий курс и количество рублей. Итоговое значение должно быть округлено до двух знаков после запятой.
                // (Пример для теста работы программы: Курс доллара = 67,55, Количество рублей: 1000, Итого: 14,80 долларов)
                Big_task_3 myClassObject_ВIG_3 = new Big_task_3();
                myClassObject_ВIG_3.Big_task_3_myFancyMethod();
                break;
            default:
                value = 0;
        }

    }

}
