public class Caller{
    public static void main(String[] args) {
        ElectronicDevice dev1 = new Television();
        dev1.turnOn();

        dev1.setState(PowerState.OFF);
    }
}
