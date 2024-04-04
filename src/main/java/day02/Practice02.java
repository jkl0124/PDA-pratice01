package day02;

public class Practice02 {
    public static void main(String[] args) {
        Taxi taxi = new Taxi("QkdQkd");
        Bus bus = new Bus("qnfmdqnfmd");
        taxi.getSound();
        bus.getSound();
        taxi.getWheel();
        bus.getWheel();
    }
}

class Car{
    String sound;
    int wheel = 4;
  Car(String sound) {
        this.sound = sound;
    }

    public void getSound() {
        System.out.println("sound = " + sound);
    }

    public void getWheel(){
        System.out.println("wheel = " + wheel);
    }

}

class Bus extends Car{

    public Bus(String sound) {
        super(sound);
    }
}

class Taxi extends Car{

    public Taxi(String sound) {
        super(sound);
    }
}


