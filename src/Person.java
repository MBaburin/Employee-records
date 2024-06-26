public abstract class Person {

    private String name;
    private int age;
    private final int id;
    private static int counter;

    static {
        counter = 1;
    }

    Person (){
        id = counter++;
    }
    public void info() {
        System.out.printf("Id: %d Name: %s Age: %d",id, name, age);
        System.out.println(" ");
    }

    public void setName (String name){
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getId() {
        return id;
    }

    public void changeName(String name){
        this.name =name;
    }

    public void changeAge(int age){

        this.age =age;
    }

}
