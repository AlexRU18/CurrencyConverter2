/*1. USD/JPY, bid=125.42, ask=125.43
2. EUR/USD, bid=1.2544, ask=1.2545
3. GBP/USD, bid=14.2842, ask=14.2843
4. AUD/USD, bid=16.2042, ask=16.8543
5. USD/CHF, bid=1.3750, ask=1.3754
6. EUR/JPY, bid=15.2942, ask=15.8543
7. EUR/GBP, bid=0.6790, ask=0.6794
*/

import java.text.DecimalFormat;
import java.util.Scanner;

class userIO {

    double inputValue;
    double resultValue;
    double bid = 2;
    double ask = 0;
    String inputCurrencyFrom;
    String inputCurrencyTo;
    int choosekey;
    int exitkey;

    private DecimalFormat formattedDouble = new DecimalFormat("#0.00");
    private Scanner scanner = new Scanner(System.in);
    private Calculation calculation = new Calculation();

    public void listening() {
        do{
            System.out.println("Выберите необходимую валюту для конвертации: ");
            inputCurrencyFrom = scanner.next();
            //Проверка правильности ввода валюты
            //
            System.out.println("В какую валюту будем переводить?");
            inputCurrencyTo = scanner.next();
            //Проверка правильности ввода валюты
            //
            //Проверка возможности конвертации

            System.out.println("Необходимо ввести количество выбранной валюты. Дробная часть пишется после запятой.");
            inputValue = scanner.nextDouble();
            System.out.println("Введено " + formattedDouble.format(inputValue));
            System.out.println();

            System.out.println("1- Продажа; 2- Покупка.");
            choosekey = scanner.nextInt();
            switch (choosekey) {
                case 1:
                    System.out.println("Продажа:");
                    resultValue = calculation.Calculate(inputValue,bid);
                    System.out.println(resultValue);
                    break;
                case 2:
                    System.out.println("Покупка:");
                    resultValue = calculation.Calculate(inputValue,ask);
                    System.out.println(resultValue);
                    break;
                default:
                    break;
            }

            System.out.println("Введите 1, если хотите завершить выполнение программы.");
            exitkey = scanner.nextInt();
        }while (exitkey != 1);
    }
}
