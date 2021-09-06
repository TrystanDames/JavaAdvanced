public class GroupB extends Students{
    private String module;
    private char group;
    private int contributions;

    public GroupB(String name, String surname, String email, String repository, int age, String module) {
        super(name, surname, email, repository, age);
        this.module = module;
    }

    public GroupB(String name, String surname, String email, String repository, int age, String module, char group) {
        super(name, surname, email, repository, age);
        this.module = module;
        this.group = group;
    }

    public GroupB(String name, String surname, String email, String repository, int age, String module, char group, int contributions) {
        super(name, surname, email, repository, age);
        this.module = module;
        this.group = group;
        this.contributions = contributions;
    }

    @Override
    public void display(){
        super.display();
        System.out.println("Module: " + getModule());
        System.out.println("Group: " + getGroup());
        System.out.println("Contributions: " + getContributions());
        System.out.println("\n");
    }

    public String getModule() {
        return module;
    }

    public char getGroup() {
        return group;
    }

    public int getContributions() {
        return contributions;
    }
}
