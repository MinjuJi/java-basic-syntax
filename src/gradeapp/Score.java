package gradeapp;

public class Score {
    private int no;
    private String name;
    private int kor;
    private int eng;
    private int math;
    private int total;
    private int average;

    public Score(int no, String name, int kor, int eng, int math) {
        this.no = no;
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
        reduce();
    }

    public void reduce() {
        this.total = kor + eng + math;
        this.average = total / 3;
    }

    public int getNo() {
        return no;
    }

    public String getName() {
        return name;
    }

    public int getKor() {
        return kor;
    }

    public int getEng() {
        return eng;
    }

    public int getMath() {
        return math;
    }

    public int getTotal() {
        return total;
    }

    public int getAverage() {
        return average;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setKor(int kor) {
        this.kor = kor;
    }

    public void setEng(int eng) {
        this.eng = eng;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public void setAverage(int average) {
        this.average = average;
    }
}
