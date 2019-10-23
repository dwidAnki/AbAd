public class Application {


    public static void main(String[] args){

        System.out.println("Hello World");
        Person person=new Person("Ankita");
        //System.out.println("My first name :" + person.getName());

                  person.setName(person.getName()+" " +"Dwivedi");//setting full name
                  person.writeName();
    }
}


