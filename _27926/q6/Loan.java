package _27926.q6;

public class Loan extends Withdrawal {
    private double loanAmount;
    private double interestRate;
    private double duration;

    public Loan(int id, String createdDate, String updatedDate,
                String bankName, String branchCode, String address,
                String accountNumber, String accountType, double balance,
                String customerName, String email, String phoneNumber,
                String transactionId, String transactionType, double amount,
                double depositAmount, String depositDate,
                double withdrawalAmount, String withdrawalDate,
                double loanAmount, double interestRate, double duration) {
        super(id, createdDate, updatedDate,
                bankName, branchCode, address,
                accountNumber, accountType, balance,
                customerName, email, phoneNumber,
                transactionId, transactionType, amount,
                depositAmount, depositDate,
                withdrawalAmount, withdrawalDate);

        if (loanAmount <= 0 || interestRate <= 0 || duration <= 0) {
            throw new BankDataException("Loan amount, interest rate and duration must be > 0");
        }

        this.loanAmount = loanAmount;
        this.interestRate = interestRate;
        this.duration = duration;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public double getDuration() {
        return duration;
    }
}
