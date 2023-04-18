package environment.project.controller;

public class LoginForm {
    private String userId;
    private String userPassword;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public LoginForm(String userId, String userPassword) {
        this.userId = userId;
        this.userPassword = userPassword;
    }
}
