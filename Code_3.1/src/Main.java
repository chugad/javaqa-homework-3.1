public class Main {
    public static void main(String[] args) {
        long TicketPrice = 39_99; // kopecks
        long MoneyForOneMile = 20_00; // kopecks
        long TotalMiles = TicketPrice / MoneyForOneMile;
        System.out.println(TotalMiles);
    }
}
