abstract class Person {

    private String name;

    // abstract method
    public abstract void displayInfo();

    // constructor
    public void Person(String name) {
        this.name = name;
    }

    // setter method
    public void setName(String name){
        this.name = name;
    }

    // getter method
    public String getName(){
        return this.name;
    }

}
