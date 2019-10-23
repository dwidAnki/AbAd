public class Person {

    private Brain brain;
private String name;
    public Person() {
        System.out.println("Constructor Running!");
    }


    public Person(String name){
        this.name=name;
        brain=new Brain();
     //System.out.println("Name is : " + name);
 }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void writeName(){
        System.out.println("My name is "+ this.name);
    }
}
