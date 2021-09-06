public class Students {
    private String name;
    private String surname;
    private String email;
    private String repository;
    private int age;

    public void display() {
        System.out.println("Name: " + getName());
        System.out.println("Surname: " + getSurname());
        System.out.println("Email: " + getEmail());
        System.out.println("Repository: " + getRepository());
        System.out.println("Age: " + getAge());
    }

    public Students(String name, String surname, String email, String repository, int age) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.repository = repository;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRepository() {
        return repository;
    }

    public void setRepository(String repository) {
        this.repository = repository;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
