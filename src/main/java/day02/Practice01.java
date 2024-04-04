package day02;

public class Practice01 {


    public static void main(String[] args) {
        Phone phone1 = new SamsungPhone();
        Phone phone2 = new ApplePhone();
        Phone[] phoneList = {phone1,phone2};
        Store store1 = new Store(phoneList);
        Person sonny = new Person("손흥민");
        Person becom = new Person("베컴");
        sonny.buyPhone(store1,0);
        becom.buyPhone(store1,1);
        sonny.turnOnPhone();
        becom.turnOnPhone();
    }
}

class Person{
    String name;
    Phone myPhone;
    Person(String name){
        this.name=name;
    }

    public void setMyPhone(Phone myPhone) {
        this.myPhone = myPhone;
    }

    public void turnOnPhone(){
        myPhone.getSound();
    }

    public void buyPhone(Store store,int n){
        this.myPhone = store.sellPhone(n);
    }
}


class Phone{
    String sound;
    Phone(String sound){
        this.sound = sound;
    }

    public void getSound(){
        System.out.println("sound = " + sound);
    }

}

class SamsungPhone extends Phone{

    SamsungPhone() {
        super("삐삐삒");
    }
}
class ApplePhone extends  Phone{

    ApplePhone() {
        super("삑");
    }
}
class Seller extends Person{
    Store store;
    public Seller(String name,Store store) {
        super(name);
        this.store = store;
    }



}

class Store{
    Phone phone[];

    public Store(Phone[] phone) {
        this.phone = phone;
    }

    public Phone sellPhone(int n){
        return phone[n];
    }
    public void setPhone(Phone[] phone){
        this.phone = phone;
    }
}