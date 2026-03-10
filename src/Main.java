
public class Main {
    public static void main(String[] args) {
        //Задача №1
        System.out.println("Задача №1");
        char clientOS = '0';
        if (clientOS == '0') {
            System.out.println("Для iOS — «Установите версию приложения для iOS по ссылке»");
        } else {
            System.out.println("Для Android — «Установите версию приложения для Android по ссылке».");
        }
        //Задача №2
        System.out.println("Задача №2");
        int clientDeviceYear = 2014;
        if (clientOS == '0' && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
        } else if (clientOS == '1' && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для " + (clientOS == '0' ? "iOS" : "Android") + " по ссылке:");
        }
        //Задача №3
        System.out.println("Задача №3");
        int year = 1500;
        if (year > 1584) {
            if (((year % 4 == 0) && (year % 100 != 0))||(year % 400 == 0)){
                System.out.println(year+" год является високосным");
            }else {
                System.out.println(year+" год не является високосным");
            }
        }
        //Задача №4
        System.out.println("Задача №4");
        int deliveryDistance=19;
        int deliveryDay;
        }
    }