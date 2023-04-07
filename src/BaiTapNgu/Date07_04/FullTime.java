package BaiTapNgu.Date07_04;

public class FullTime extends Employee{
   int yearOfExperience;

    public int getYearOfExperience() {
        return yearOfExperience;
    }

    public void setYearOfExperience(int yearOfExperience) {
        this.yearOfExperience = yearOfExperience;
    }

    public FullTime(int id, String name, int age, int yearOfExperience) {
        super(id, name, age);
        this.yearOfExperience = yearOfExperience;
    }

    public FullTime(int yearOfExperience) {
        super();
        this.yearOfExperience = yearOfExperience;
    }

    public static void main(String[] args) {

    }
    public  int getLuongFullTime(){
        return this.yearOfExperience*20000000;
    }
}
