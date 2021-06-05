public class Student {
    private String code;
    private String name;
    private String dob;
    private boolean gender;
    private String address;
    private double gpa;

    public Student(String code, String name, String dob, boolean gender, String address, double gpa) {
        this.code = code;
        this.name = name;
        this.dob = dob;
        this.gender = gender;
        this.address = address;
        this.gpa = gpa;
    }

    public Student() {
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String displayGender() {
        if (gender) {
            return " Nam";
        } else {
            return "Nu";
        }
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }


    @Override
    public String toString() {
        return "Student{" +
                "code='" + getCode() + '\'' +
                ", name='" + getName() + '\'' +
                ", dob='" + getDob() + '\'' +
                ", gender=" + displayGender() +
                ", address='" + getAddress() + '\'' +
                ", gpa=" + getGpa() +
                '}';
    }
}
