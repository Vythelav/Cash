package phone_app;

import org.example.BankCard;

public class AppUser implements AppUserInterface{
    String userName;
    int userPhone;
    int userPassword;

    public AppUser (String userName,int userPhone, int userPassword ) {
        this.userName = userName;
        this.userPhone = userPhone;
        this.userPassword = userPassword;
    }
    @Override
    public String getUserName() {
        return userName;
    }

    @Override
    public int getUserPhone() {
        return userPhone;
    }

    @Override
    public int getUserPassword() {
        return userPassword;
    }
}
