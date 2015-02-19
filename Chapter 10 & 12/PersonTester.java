import java.util.ArrayList;

public class PersonTester
{
    public Person firstAndLast()
    {
        ArrayList<Person> people = new ArrayList<Person>();
        
        Person person1 = new Person("Bobby");
        people.add(person1);
        Person person2 = new Person("John");
        people.add(person2);
        Person person3 = new Person("Billy");
        people.add(person3);
        Person person4 = new Person("Fin");
        people.add(person4);
        Person person5 = new Person("Schmit");
        people.add(person5);
        Person person6 = new Person("Alex");
        people.add(person6);
        Person person7 = new Person("Player");
        people.add(person7);
        Person person8 = new Person("Nancy");
        people.add(person8);
        Person person9 = new Person("Olivia");
        people.add(person9);
        Person person10 = new Person("Krissy");
        people.add(person10);
        
        Person first = people[0];
        Person last = people[0];
        
        for(int i = 1; i < people.length; i++)
        {
            if(people[i].compareTo(first) < 0)
            {
                first = people[i];
            }
            if(people[i].compareTo(first) > 0)
            {
                last = people[i];
            }
        }
        return first;
        return last;
    }
}
