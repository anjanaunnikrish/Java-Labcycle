class Device{
    final void powerOn(){
        System.out.println("Power on the device");
    }
}
class Phone extends Device{
    void call(String number){
        System.out.println("Phone is calling " + number);
    }
    void installApp(String name){
        System.out.println("Phone is installing " + name);
    }
}
class SmartPhone extends Phone{
    @Override
    void installApp(String name) {
        System.out.println("SmartPhone is installing " + name);
    }
}
public class DeviceHierarchy {
    public static void main(String[] args){
        SmartPhone s = new SmartPhone();
        s.powerOn();
        s.call("9947381248");
        s.installApp("Instagram");
    }
}