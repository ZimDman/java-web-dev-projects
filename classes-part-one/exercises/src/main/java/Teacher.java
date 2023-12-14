public class Teacher {

    private String firstName;
    private String lastName;
    private String subject;
    private int yearsTeaching;


    public Teacher (String firstname, String lastname, String subject, int years)
    {
        this.firstName = firstname;
        this.lastName = lastname;
        this.subject = subject;
        this.yearsTeaching = years;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSubject() {
        return subject;
    }

    public int getYearsTeaching() {
        return yearsTeaching;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setYearsTeaching(int yearsTeaching) {
        this.yearsTeaching = yearsTeaching;
    }
}
