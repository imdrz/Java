class Person {
    private int age;
    private String firstName;
    private String lastName;
    private int money;

    
    public Person(int age, String lastName, String firstName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.money = 0;
    }
    public Person(String lastName, String firstName) {
        this(0, lastName, firstName);
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public int getMoney() {
        return money;
    }
    public void transaction(int amt) {
        this.money = this.money + amt;
    }
    
}