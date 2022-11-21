import java.time.LocalDate;

public class MetodHomeWork {
    public static void main(String[] args) {
// задание 1
        int testYear = 2023;
        checkYear(testYear); // передача значения в метод проверки кода( не понимаю как это работает)
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
}
