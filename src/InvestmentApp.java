public class InvestmentApp {
    public String updateAccounts(double savingsAccountBalence, double indexFundBalence,
                                 double depositAmount){
        if (savingsAccountBalence > 50000) {
            indexFundBalence += depositAmount;
            return  String.format("Index funds updated. New balence: $%.2f", indexFundBalence);
        } else if (savingsAccountBalence + depositAmount > 50000) {
            double amountToIndexFund = (savingsAccountBalence + depositAmount) - 50000;
            savingsAccountBalence = 50000;
            indexFundBalence += amountToIndexFund;
            return String.format("Savings account updated. New balence: $%.2f. " +
                    "Index funds updated. New balence: $%.2f", savingsAccountBalence, indexFundBalence);
        } else {
            savingsAccountBalence += depositAmount;
            return String.format("Savings account updated. New balence:$%.2f", savingsAccountBalence);
        }
    }
}
