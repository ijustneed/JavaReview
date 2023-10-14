/**
 * @version 1.0
 * @author： xu
 * @date： 2023-09-20 16:37
 */

public class Student{
    public int number;
    public int state;
    public int score;
    private String sname;

    @Override
    public String toString() {
        return "Student{" +
                "number=" + number +
                ", state=" + state +
                ", score=" + score +
                ", sname='" + sname + '\'' +
                '}';
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getSname() {
        return sname;
    }

    public Student(int number, int state, int score, String sname) {
        this.number = number;
        this.state = state;
        this.score = score;
        this.sname = sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    //方法的重载  形参不同即可 方法名可相同
    public void hello(String word) {
        System.out.println(word);
    }
    public void hello() {
        System.out.println("hello");
    }





}
