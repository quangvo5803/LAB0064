package DataAccess;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import Common.Validation;

public class InputDao {
    private static InputDao instance = null;

    public static InputDao Instance() {
        if (instance == null) {
            synchronized (InputDao.class) {
                if (instance == null) {
                    instance = new InputDao();
                }
            }
        }
        return instance;
    }

    public void getPhone(String phone) {
        String PHONE_VALID = "^[0-9]{10}$";
        while (true) {
            if (phone.matches(PHONE_VALID)) {
                System.out.println("Phone valid: " + phone);
                break;
            } else {
                System.out.println("Phone number must be 10 digits");
                phone = Validation.getString("Enter phone number: ");
            }
        }
    }

    public void checkInputDate(String date) {
        try {
            Date d = new SimpleDateFormat("dd/MM/yyyy").parse(date);
            System.out.println("Date valid: " + d.toString());
        } catch (ParseException ex) {
            System.err.println("Date to correct format(dd/MM/yyyy)");
        }

    }

    public void checkInputEmail(String email) {
        String EMAIL_VALID = "^[A-Z0-9a-z._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}$";
        while (true) {
            if (!email.matches(EMAIL_VALID)) {
                System.err.println("Email must be correct format");
                email = Validation.getString("Enter email: ");
            } else {
                System.out.println("Email valid: " + email);
                break;
            }
        }
    }
}
