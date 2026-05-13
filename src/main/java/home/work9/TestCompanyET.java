package home.work9;

public class TestCompanyET {

    public static void main(String[] args) {

        CompanyET company = new CompanyET(
                "ProSoft", "13.05.2025", "BG12345678",
                "Ivan Ivanov", 1000, 3500);

        System.out.printf(
                "Company Name: %s | Created Date: %s | Bulstat: %s | Owner Name: %s | Profit: %.2f%n",
                company.getCompanyName(), company.getCreationDate(), company.getBulstat(),
                company.getOwnerName(), company.calculateProfit());

        System.out.println(company.issueInvoice());
    }
}
