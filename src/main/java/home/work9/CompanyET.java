package home.work9;

public class CompanyET extends Company implements Invoice {
    private String ownerName;
    private double initialCapital;
    private double currentCapital;

    // Constructor
    public CompanyET(String companyName,String creationDate, String bulstat,
                     String ownerName, double initialCapital, double currentCapital) {
        super(companyName, creationDate, bulstat);

        this.ownerName = ownerName;
        this.initialCapital = initialCapital;
        this.currentCapital = currentCapital;
    }

    // Getters and Setters
    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        if (!ownerName.isEmpty()) {
            this.ownerName = ownerName;
        } else {
            System.out.println("ERROR: Owner name cannot be empty!");
        }
    }

    public double getInitialCapital() {
        return initialCapital;
    }

    public void setInitialCapital(double initialCapital) {
        if (initialCapital > 0) {
            this.initialCapital = initialCapital;
        } else {
            System.out.println("ERROR: Initial capital must be greater than 0!");
        }
    }

    public double getCurrentCapital() {
        return currentCapital;
    }

    public void setCurrentCapital(double currentCapital) {
        if (currentCapital > 0) {
            this.currentCapital = currentCapital;
        } else {
            System.out.println("ERROR: Current capital must be greater than 0!");
        }
    }

    // Profit method
    public double calculateProfit() {
        return currentCapital - initialCapital;
    }

    // Interface method
    @Override
    public String issueInvoice() {
        return "Invoice has been issued!";
    }
}
