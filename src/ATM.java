public class ATM {
    private double balance ;
    private double depositAmount;
    private double withdrawAmount;

    // default constructor
    public ATM() {          // As it is default one no need of parameters

    }

    // getter Setter for all  the Private variables

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getDepositAmount() {
        return depositAmount;
    }

    public void setDepositAmount(double depositAmount) {
        this.depositAmount = depositAmount;
    }

    public double getWithdrawAmount() {
        return withdrawAmount;
    }

    public void setWithdrawAmount(double withdrawAmount) {
        this.withdrawAmount = withdrawAmount;
    }
}
