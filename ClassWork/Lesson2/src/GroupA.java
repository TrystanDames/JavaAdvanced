public class GroupA extends Students{
    private String module;
    private char group;
    private int attendance;

    public GroupA(String name, String surname, String email, String repository, int age, String module, char group, int attendance) {
        super(name, surname, email, repository, age);
        this.module = module;
        this.group = group;
        this.attendance = attendance;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Module: " + getModule());
        System.out.println("Group: " + getGroup());
        System.out.println("Attendance: " + getAttendance());
        System.out.println("\n");
    }

    public String getModule() {
        return module;
    }


    public char getGroup() {
        return group;
    }

    public int getAttendance() {
        return attendance;
    }

}
