package sample.spring;

/**
 * Created by Makhamwan on 4/10/2017 AD.
 */

public interface BankAccountDao {
    int createBankAccount(BankAccountDetails bankAccountDetails);
    void subtractFromAccount(int bankAccountId, int amount);
}