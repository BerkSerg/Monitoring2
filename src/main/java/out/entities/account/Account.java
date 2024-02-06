package out.account;

import out.readings.Reading;

import java.util.Arrays;

public class Account {
    private String accountNumber; //лицевой счет
    private Reading[] readings = new Reading[500];

    public Account(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Reading[] getReadings() {
        return readings;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNumber='" + accountNumber + '\'' +
                ", readings=" + Arrays.toString(readings) +
                '}';
    }
}
