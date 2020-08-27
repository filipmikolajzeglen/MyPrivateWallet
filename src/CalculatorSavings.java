public class CalculatorSavings {

    private int getDifference(int amount, int payment) {
        return amount - payment;
    }

    void doCalculateMonth(int salary, int amountOfCushion, int years) {
        int financialCushion = 0;
        int PCrate = 4423;
        for (int y = 0; y < years; y++) {
            for (int i = 1; i < 13; i++) {
                int sum = salary;
                System.out.println("--------- " + MonthSummary.choseMonth(i).toUpperCase() + " ------------------------------------\n");
                System.out.println("YOUR SALARY: " + salary + "PLN (FC " + financialCushion + " PLN)");

                if (i == 3 || i == 10) {
                    System.out.println("\t - University \t [" + financialCushion + " - 2100 = " + getDifference(financialCushion, 2100) + "\tPLN] FC");
                    financialCushion = getDifference(financialCushion, 2100);
                }

                if (financialCushion < PCrate && PCrate != 0) {
                    System.out.println("\t - Computer \t [" + sum + " - 300 \t= " + getDifference(sum, 268) + " \tPLN]");
                    sum = getDifference(sum, 268);
                    PCrate = getDifference(PCrate, 268);
                } else if (financialCushion > PCrate && PCrate != 0) {
                    System.out.println("\t - Repaymant PC  [" + financialCushion + " - " + PCrate + " \t= " + getDifference(financialCushion, PCrate) + " \tPLN] FC");
                    financialCushion = getDifference(financialCushion, PCrate);
                    PCrate = 0;
                }

                System.out.println("\t - Apartment \t [" + sum + " - 900 \t= " + getDifference(sum, 900) + " \tPLN]");
                sum = getDifference(sum, 900);
                System.out.println("\t - Mobile \t\t [" + sum + " - 30 \t= " + getDifference(sum, 30) + " \tPLN]");
                sum = getDifference(sum, 30);
                System.out.println("\t - Huel \t\t [" + sum + " - 430 \t= " + getDifference(sum, 430) + " \tPLN]");
                sum = getDifference(sum, 430);
                System.out.println("\t - Cushion \t\t [" + sum + " - " + amountOfCushion + " \t= " + getDifference(sum, amountOfCushion) + "\tPLN]\n");
                sum = getDifference(sum, amountOfCushion);
                financialCushion += amountOfCushion;

                if (sum > 800) {
                    int additionalMoney = sum - 800;
                    sum -= additionalMoney;
                    financialCushion += additionalMoney;
                    System.out.println("\t -> ADDICTIONAL CUSHION: " + additionalMoney + " PLN");
                }

                System.out.println("\t -> THE REST OF MONEY: " + sum + " PLN\n");
            }
        }
    }
}
