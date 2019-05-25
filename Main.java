import java.util.Scanner;

public class PersonExample {
    
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args){
        
        Person p1 = new Person();
        Person p2 = new Person();
        Person p3 = new Person();
        
        Scanner s = new Scanner(System.in);
        
        p1.setName("Thanos");
        p1.setAge(checkAge(s,p1));
        p1.setColor("Black");
        p1.setSport("Basketball");
        
        p2.setName("Nick");
        p2.setAge(checkAge(s,p2));
        p2.setColor("Yellow");
        p2.setSport("Tennis");
        
        p3.setName("John");
        p3.setAge(checkAge(s,p3));
        p3.setColor("Red");
        p3.setSport("Football");
        
        s.close();
        
        Person []people = {p1,p2,p3};
        
        for(Person x:people){
            System.out.println("My name is "+x.getName());
            System.out.println("My age is "+x.getAge());
            System.out.println("My color is "+x.getColor());
            System.out.println("My sport is "+x.getSport());
        }
        
        //2nd way of printing out the data
        
        for (int i=0;i<people.length;i++){
            System.out.println("My name is "+people[i].getName());
            System.out.println("My age is "+people[i].getAge());
            System.out.println("My age is "+people[i].getColor());
            System.out.println("My sport is "+people[i].getSport());
        
        }
        
        //Calling the 2 methods to print the youngest and oldest
        System.out.println("The youngest person in the array is "+FindYoungest(people).getName());
        System.out.println("The oldest person in the array is "+FindOldest(people).getName());
        
        ////////////////////////////////////////////////////////////////
        
        WhatsYourSport(p1);
        WhatsYourSport(p2);
        WhatsYourSport(p3);

    }
    
    // Creating methods to find the youngest and the oldest
    // They return the Person object that is youngest/oldest
    
    private static Person FindYoungest(Person []array){
        Person youngest = array[0];
        for (Person object:array){
            if (object.getAge()<youngest.getAge()){
                youngest=object;
            }
        
        }
        return  youngest;
    }
    
    private static Person FindOldest(Person []array){
        Person oldest = array[0];
        for (Person object:array){
            if (object.getAge()>oldest.getAge()){
                oldest=object;
            }
        }
        return oldest;
    }
    
    private static void WhatsYourSport(Person p){
        System.out.println("You like "+p.getSport());
    }
    
    private static int checkAge(Scanner input,Person person){
        int age;
            do {
                System.out.println("What is your age "+person.getName()+"?");
                while(!input.hasNextInt()){
                    System.out.println("Age must be a number. Enter number");
                    input.nextLine();
                }
                age=input.nextInt();
            }while (age<=0);
        return age;
    } 
    
}
