/**
 * @version 1.0
 * @author： xu
 * @date： 2023-09-24 11:18
 */

public class Student
{
    public int day;

   private String Sname;

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    private int Sno;
   int number;
   protected int order;

   private int Gender;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public String getSname() {
        return Sname;
    }

    public void setSname(String sname) {
        Sname = sname;
    }

    public int getSno() {
        return Sno;
    }

    public void setSno(int sno) {
        Sno = sno;
    }

    public int getGender() {
        return Gender;
    }

    public void setGender(int gender) {
        Gender = gender;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Sname='" + Sname + '\'' +
                ", Sno=" + Sno +
                ", Gender=" + Gender +
                '}';
    }
}
