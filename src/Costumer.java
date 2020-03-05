import java.text.DecimalFormat;

public class Costumer {

    String name;
    Integer totalLoan;
    DecimalFormat interest;
    Integer years;


    public Costumer(String name, Integer totalLoan, DecimalFormat interest, Integer years) {
        this.name = name;
        this.totalLoan = totalLoan;
        this.interest = interest;
        this.years = years;
    }
}


