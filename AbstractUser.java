import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;


abstract class AbstractUser implements User {
    private final String username;
    private boolean isLoggedIn;
    private final Date registrationDate;

    public AbstractUser(String username) {
        this.username = username;
        this.registrationDate = new Date();
    }

    @Override
    public void login() {
        this.isLoggedIn = true;
    }

    @Override
    public void logout() {
        this.isLoggedIn = false;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public String getDateOfRegistration() {
        Format formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return formatter.format(registrationDate);
    }
}
