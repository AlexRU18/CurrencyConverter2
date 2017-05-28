import java.util.ArrayList;

public class CurrencyPair {

    int id;
    Currency first;
    Currency second;
    double bid;
    double ask;
}

class Data {

    public ArrayList<CurrencyPair> pairList = new ArrayList<CurrencyPair>();

    public void fillPairs() {
        CurrencyPair pair1 = new CurrencyPair();
        pair1.id = 1;
        pair1.first = Currency.USD;
        pair1.second = Currency.JPY;
        pair1.bid = 125.42;
        pair1.ask = 125.43;
        pairList.add(pair1);

        CurrencyPair pair2 = new CurrencyPair();
        pair2.id = 2;
        pair2.first = Currency.EUR;
        pair2.second = Currency.USD;
        pair2.bid = 1.2544;
        pair2.ask = 1.2545;
        pairList.add(pair2);

        CurrencyPair pair3 = new CurrencyPair();
        pair3.id = 3;
        pair3.first = Currency.GBP;
        pair3.second = Currency.USD;
        pair3.bid = 14.2842;
        pair3.ask = 14.2843;
        pairList.add(pair3);

        CurrencyPair pair4 = new CurrencyPair();
        pair4.id = 4;
        pair4.first = Currency.AUD;
        pair4.second = Currency.USD;
        pair4.bid = 16.2042;
        pair4.ask = 16.8543;
        pairList.add(pair4);

        CurrencyPair pair5 = new CurrencyPair();
        pair5.id = 5;
        pair5.first = Currency.USD;
        pair5.second = Currency.CHF;
        pair5.bid = 1.3750;
        pair5.ask = 1.3754;
        pairList.add(pair5);

        CurrencyPair pair6 = new CurrencyPair();
        pair6.id = 6;
        pair6.first = Currency.EUR;
        pair6.second = Currency.JPY;
        pair6.bid = 15.2942;
        pair6.ask = 15.8543;
        pairList.add(pair6);

        CurrencyPair pair7 = new CurrencyPair();
        pair7.id = 7;
        pair7.first = Currency.EUR;
        pair7.second = Currency.GBP;
        pair7.bid = 0.6790;
        pair7.ask = 0.6794;
        pairList.add(pair7);
    }

    public void printData() {
        for (CurrencyPair pair : pairList) {
            System.out.print(pair.first + "/" + pair.second);
            System.out.println(" Продажа: " + pair.bid + " | Покупка: " + pair.ask);
        }

    }
}