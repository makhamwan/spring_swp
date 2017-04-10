package sample.spring;

/**
 * Created by Makhamwan on 4/10/2017 AD.
 */

import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;

@Repository(value = "bankAccountDao")
public class BankAccountDaoImpl implements BankAccountDao {

    private Logger logger = Logger.getLogger(BankAccountDaoImpl.class);

    @Override
    public int createBankAccount(final BankAccountDetails bankAccountDetails) {
        logger.info(String.format("createBankAccount method invoked with params (BankAccountDetails=%s", bankAccountDetails.toString() ));
        //--create account and return it's primary key.
        return 1;
    }

    public void subtractFromAccount(int bankAccountId, int amount) {
        logger.info(String.format("subtractFromAccount method invoked with params (bankAccountId=%d, amount=%d)",bankAccountId,amount));
        //-- subtract fixed deposit amount from bank account
    }
}