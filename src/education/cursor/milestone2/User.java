package education.cursor.milestone2;

import java.time.LocalDate;

public class User {
    private String email;
    private LocalDate loginDate;
    private String team;

    public User(String email, LocalDate loginDate, String team) {
        this.email = email;
        this.loginDate = loginDate;
        this.team = team;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getLoginDate() {
        return loginDate;
    }

    public void setLoginDate(LocalDate loginDate) {
        this.loginDate = loginDate;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    @Override
    public String toString() {
        return "{" + "email='" + email + '\'' +
                ", loginDate=" + loginDate +
                ", team='" + team + '\'' +
                '}';
    }
}
