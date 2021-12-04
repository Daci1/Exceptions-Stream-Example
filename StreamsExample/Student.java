package StreamsExample;

public class Student {
    private String firstName;
    private String lastName;
    private Integer age;
    private Double meanGrade;

    public Student(){}

    public Student(String firstName, String lastName, Integer age, Double meanGrade) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.meanGrade = meanGrade;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Integer getAge() {
        return age;
    }

    public Double getMeanGrade() {
        return meanGrade;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setMeanGrade(Double meanGrade) {
        this.meanGrade = meanGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", meanGrade=" + meanGrade +
                '}' + "\n";
    }

    public boolean isUnderage(){
        return this.age < 18;
    }
}
