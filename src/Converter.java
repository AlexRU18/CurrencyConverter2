public class Converter {

    int userId;
    String currencyFrom;
    String currencyTo;
    Double bid;
    Double ask;

    public static void main(String[] args) {
        userIO userIO = new userIO();
        userIO.listening();
    }
}
