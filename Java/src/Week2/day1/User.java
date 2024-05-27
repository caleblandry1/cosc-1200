package Week2.day1;

import java.util.Date;

public class User {

    private static int userAge = 25;
    private String firstname;
    private String lastname;
    private Date dob;

    //Constructor
    public User(String _firstname, String _lastname, Date _dob) {
        this.firstname = _firstname;
        this.lastname = _lastname;
        this.dob = _dob;
    }

    public String getFirstname () {
        return firstname;
            }
            //Getters
}