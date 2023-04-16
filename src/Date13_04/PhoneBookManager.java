package Date13_04;

import java.util.Arrays;
import java.util.Scanner;

public class PhoneBookManager extends Phone {
    private Contact[] phoneList;
    private Phone[] phones;
    private IPhone[] iPhones;
    private Scanner scanner;


    public PhoneBookManager() {

        scanner = new Scanner(System.in);
        phoneList = new Contact[4];
        Contact phoneList1 = new Contact("Đức", "0909106986");
        Contact phoneList2 = new Contact("Vũ", "0705933933");
        phoneList[0] = phoneList1;
        phoneList[1] = phoneList2;
    }

    @Override
    public void insertPhone() {
        Contact contact = new Contact();
        contact = inputContact();
        int index = 0;
        for (Contact contact1 : phoneList) {
            if (contact1 != null) {
                index++;
            }
        }
        phoneList[index] = contact;
    }

    @Override
    public void removePhone() {
        System.out.println("nhập tên muốn xóa:");
        String name1 = scanner.nextLine();
        int indexDelete = getContact(name1);
        Contact[] deleteContact = new Contact[phoneList.length -1];
        if (indexDelete != -1){
            System.arraycopy(phoneList,0,deleteContact,0,indexDelete);
            System.arraycopy(phoneList,indexDelete+1,deleteContact,
                    indexDelete,phoneList.length -indexDelete-1);
            phoneList = deleteContact;
            System.out.println("Xóa thành công!");
        }else {
            System.out.println("không tồn tại tên cần xóa");
        }

    }

    @Override
    public void updatePhone(String name, String newPhone) {

    }

    @Override
    public void disPlay() {
        for (Contact contact : phoneList) {
            System.out.println(contact);
        }
    }

    public Contact inputContact() {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Nhập tên:");
        String name = scanner1.nextLine();
        System.out.println("Nhập Phone:");
        String phone = scanner1.nextLine();
        return new Contact(name, phone);
    }

    public int getContact(String name) {
        for (int i = 0; i < phoneList.length; i++) {
            if (phoneList[i] != null) {
                if (phoneList[i].getName().equalsIgnoreCase(name)){
                    return i;
                }
            }
        }
        return -1;
    }

}

