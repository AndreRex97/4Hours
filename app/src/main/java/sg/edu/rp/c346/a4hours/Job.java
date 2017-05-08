package sg.edu.rp.c346.a4hours;

/**
 * Created by 15017103 on 9/5/2017.
 */

public class Job {
    private String jobTitle;
    private int Salary;
    private String dateTime;
    private String language;

    public Job(String jobTitle, int salary, String dateTime, String language) {
        this.jobTitle = jobTitle;
        Salary = salary;
        this.dateTime = dateTime;
        this.language = language;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public int getSalary() {
        return Salary;
    }

    public String getDateTime() {
        return dateTime;
    }

    public String getLanguage() {
        return language;
    }
}
