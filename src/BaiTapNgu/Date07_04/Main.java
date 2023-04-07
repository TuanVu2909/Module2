package BaiTapNgu.Date07_04;

public class Main {
    public static void main(String[] args) {
       FullTime fullTime1 = new FullTime(12,"Chữ",25,8);
       FullTime fullTime2 = new FullTime(22,"Đức",28,9);
       PartTime partTime1 = new PartTime(12,"Vũ",32,4);
       PartTime partTime2 = new PartTime(12,"Thái",21,3);
       Employee[] employees = new Employee[]{fullTime1,fullTime2,partTime1,partTime2};
       for (int i =0; i<employees.length;i++){
           System.out.println(employees[i]);
       }

    }
}
