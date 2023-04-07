package BaiTapNgu.Date07_04;

public class PartTime extends Employee{
    int wordTime;

    public int getWordTime() {
        return wordTime;
    }

    public void setWordTime(int wordTime) {
        this.wordTime = wordTime;
    }

    public PartTime(int id, String name, int age, int wordTime) {
        super(id, name, age);
        this.wordTime = wordTime;
    }

    public PartTime(int wordTime) {
        super();
        this.wordTime = wordTime;
    }

    public static void main(String[] args) {

    }
    public int getLuongFullTime(){
       return this.wordTime*25000;
    }
}
