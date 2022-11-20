import java.time.LocalDate;

public class MetodHomeWork {
    public static void main(String[] args) {
        // задание 1
    int testYear = 2020;
    checkYear(testYear); // передача значения в метод проверки кода( не понимаю как это работает)

        // задание 2
        int currentYear = LocalDate.now().getYear();// текущая дата (скоро 23 год УРА! УРА!)
        int clientOS = 0;// клинетская ось 0 - IOS, 1 - Android
        int clientDeviceYear = 2022;// год выхода телефона
        checkPhoneAndSetupBankApp(currentYear, clientOS, clientDeviceYear);

        // задание 3

        int deliveryDistance = 46;// дистанция

        int deliveryDay = deliveryCalculation(deliveryDistance);// нам необходимо узнать сколько нужно дней для доставки
        System.out.println("потребуеться дней " + deliveryDay); //вывод

}
        //  задание 1
    public static int checkYear (int testYear){ // метод проверки года, принимает значение года
        System.out.println(" ");

        if(testYear % 4 == 0 & testYear % 100 != 0){
            // если год делиться на 4 без остатка и делиться на 100 с остатком год високосный
            System.out.println(testYear + " год високосный");
        }else if (testYear % 4 ==0 & testYear % 100 ==0 & testYear % 400 == 0){
            // иначе если год делиться на 4 на 100 и на 400 без остатка
            System.out.println(testYear + " год високосный");
        } else System.out.println(testYear + " год не високосный");
        // иначе год не високосный

        return testYear;// возвращаем значение
    }

        //задание 2
    public static int checkPhoneAndSetupBankApp(int currentYear, int clientOS, int clientDeviceYear) {
        System.out.println(" ");

        if (clientOS == 0 & clientDeviceYear >= currentYear) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 0 & clientDeviceYear < currentYear) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 1 & clientDeviceYear >= currentYear) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 1 & clientDeviceYear < currentYear) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else System.out.println(" Такой версии OC нет ");

        return currentYear & clientOS & clientDeviceYear;
    }

    public static int deliveryCalculation(int deliveryDistance){// принимаем дистанцию
        System.out.println(" ");

        int deliveryDay = 0;
        if (deliveryDistance <= 20){
            int day = 1; deliveryDay = day;

        }
        else if (deliveryDistance >20 & deliveryDistance <60){
            int day = 2; deliveryDay = day;

        }
        else if (deliveryDistance >=60 & deliveryDistance < 100){
            int day = 3; deliveryDay = day;

        }
        return deliveryDay ;// возвращаем количество дней
    }
}
