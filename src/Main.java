public class Main {
    public static void main(String[] args) {
        SalesManager sm = new SalesManager(new int[]{3, 6, 9, 20, 106});
        System.out.println(sm.max());

        Statistic sta = new Statistic();
        sta.arithmeticMean(new int[]{3, 6, 9, 20, 106});

    }
}