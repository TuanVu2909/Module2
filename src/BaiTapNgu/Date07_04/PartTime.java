package BaiTapNgu.Date07_04;

public class PartTime extends Employee{
    int wordTime;

    public int getWordTime() {
        return wordTime;
    }

    public void setWordTime(int wordTime) {
        this.wordTime = wordTime;
    }

    public PartTime( String name, int age, int wordTime) {
        super( name, age);
        this.wordTime = wordTime;
    }

    public PartTime(int wordTime) {
        super();
        this.wordTime = wordTime;
    }

    public static void main(String[] args) {

    }
    public int getLuongPartTime(){
       return this.wordTime*25000;
    }

    @Override
    public String toString() {
        return "PartTime{" +
                "id=" +id  +
                ", tên=" + name +
                ", tuổi='" +  age + '\'' +
                ", Lương=" + getLuongPartTime() +
                '}';
    }
}
