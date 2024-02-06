package out;

import out.account.Account;
import out.account.User;
import out.readings.WaterReading;

import java.time.LocalDateTime;
import java.util.Arrays;

public class DataBase {
    private final User[] users = new User[100];

    public DataBase() {
        dbInit();
    }

    public void dbInit() {
        User admin = new User("admin", "admin");
        User max = userInit("max", "max", "123456");
        User nick = userInit("nick", "nick", "234567");
        User ann = userInit("ann", "ann", "345678");

        users[0] = admin;
        users[1] = max;
        users[2] = nick;
        users[3] = ann;
    }

    private User userInit(String username, String password, String accountNumber) {
        Account acc = accountInit(accountNumber);
        User user = new User(username, password, acc);
        return user;
    }

    private Account accountInit(String accountNumber) {
        Account acc = new Account(accountNumber);
        LocalDateTime firstDate = LocalDateTime.now().minusDays(93);
        int startHot = 54380;
        int startCold = 77895;
        for (int i = 0; i < 3; i++) {
            acc.getReadings()[2 * i] =
                    new WaterReading(firstDate, startHot + (int) (Math.random() * 100), true);
            acc.getReadings()[2 * i + 1] =
                    new WaterReading(firstDate, startCold + (int) (Math.random() * 100), false);
            startHot = acc.getReadings()[2 * i].getMeasuring();
            startCold = acc.getReadings()[2 * i + 1].getMeasuring();
        }
        return acc;
    }

    @Override
    public String toString() {
        return "DataBase{" +
                "users=" + Arrays.toString(users) +
                '}';
    }
}
