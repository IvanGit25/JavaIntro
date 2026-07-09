package homeworks.work9;

public class Company {
    private String companyName;
    private String creationDate;
    private String bulstat;

    // Constructor
    public Company(String companyName, String creationDate, String bulstat) {
        this.companyName = companyName;
        this.creationDate = creationDate;
        setBulstat(bulstat);
    }

    // Getters ans Setters
    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        if (!companyName.isEmpty()) {
            this.companyName = companyName;
        } else {
            System.out.println("ERROR: Company name cannot be empty!");
        }
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        if (!creationDate.isEmpty()) {
            this.creationDate = creationDate;
        } else {
            System.out.println("ERROR: Creation date cannot be empty!");
        }
    }

    public String getBulstat() {
        return bulstat;
    }

    public void setBulstat(String bulstat) {
        if (bulstat.length() == 10) {
            this.bulstat = bulstat;
        } else {
            System.out.println("ERROR: Bulstat must contain exactly 10 symbols!");
        }
    }
}

