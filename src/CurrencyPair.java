import java.util.List;

public class CurrencyPair {

    int id;
    Currency first;
    Currency second;
    double bid;
    double ask;

    public static void main(String[] args) {
        userIO userIO = new userIO();
        userIO.listening();
    }
}

class Data {

    List<CurrencyPair> list;
}