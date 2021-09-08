public abstract class ElectronicDevice {

    public abstract void turnOn();
    public abstract void turnOff();

    public void setState(PowerState state) {
        switch (state) {
            case OFF:
                System.out.println("Current state: " + PowerState.OFF);
                break;
            case ON:
                System.out.println("Current state: " + PowerState.ON);
                break;
            case SUSPEND:
                System.out.println("Current state: " + PowerState.SUSPEND);
                break;
            default:
                System.out.println("There is no such state.");
        }
    }
}
