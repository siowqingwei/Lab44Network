package my.edu.tarc.lab44network;

public class Course {
    private String code;
    private String title;
    private String credit;

    //An empty constructor
    public Course() {
    }

    public Course(String code, String title, String credit) {
        this.code = code;
        this.title = title;
        this.credit = credit;
    }

    public String getCode() {
        return code;
    }

    public String getTitle() {
        return title;
    }

    public String getCredit() {
        return credit;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCredit(String credit) {
        this.credit = credit;
    }
}
