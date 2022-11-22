public class main {
    public static void main(String[] args) {
        // Задача 1
        var clientIOs = 0;
        var clientAndroid = 1;
        if (clientIOs == 0 ) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientIOs > 0 ) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }




        // Задача 2
        var clientDeviceYear = 2015;
        var android = 2016;
        var ios = 2014;
        if (clientDeviceYear < android) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientDeviceYear > ios) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");

        } else if (clientDeviceYear < ios ) {
            System.out.println("Установите версию приложения для IOS по ссылке");

        }else {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }


   // Задача 3
        int year = 2022;
       if (  year % 100 != 0 || year % 400 == 0 ) {
           System.out.println(year + " Год не високосный");
       }else {
           System.out.println(year + " Год високосный.");
       }


// Задача 4
        var x = 100;
       var deliveryDistance = 95;
        var days = x % deliveryDistance;
        System.out.println("Потребуется дней: " + days);



// Задача  5

        var  monthNumber = 13;
        switch (monthNumber){
            case 12 :
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
            break;
                case 6:
            case 7:
            case 8:
                System.out.println("Лето");
           break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
             break;
            case 13:
                System.out.println("Нет такого месяца");
                break;
        }
    }

}

