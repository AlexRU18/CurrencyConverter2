import java.text.DecimalFormat;
import java.util.Scanner;

class userIO {

    double inputValue;
    double resultValue;
    int operationType;
    int choosedPair;
    int exitkey;

    private DecimalFormat formattedDouble = new DecimalFormat("#0.00");
    private Scanner scanner = new Scanner(System.in);
    private Utils calculation = new Utils();
    private Data data = new Data();

    public void listening() {
        do {
            System.out.print("Выберите необходимую валютную пару для конвертации(цифр.): ");
            choosedPair = scanner.nextInt();
            while (choosedPair > 0 && choosedPair < 8) {

                System.out.print("Введите тип операции(1-Продажа, 2-Покупка): ");
                operationType = scanner.nextInt();
                System.out.print("Введите количество валюты: ");
                inputValue = scanner.nextDouble();
                System.out.println("Введено " + formattedDouble.format(inputValue));
                System.out.println();
                if (operationType == 1) {
                    resultValue = calculation.Calculate(inputValue, data.pairList.get(choosedPair).bid);
                } else {
                    resultValue = calculation.Calculate(inputValue, data.pairList.get(choosedPair).ask);
                }

                System.out.println(resultValue);

                System.out.println("Введите 1, если хотите завершить выполнение программы.");
                exitkey = scanner.nextInt();
            }
        } while (exitkey != 1);
    }
}