
public class Person implements Comparable<Person>
{
    private String name;
    
    public Person(String aName)
    {
        this.name = aName;
    }
    
    public int compareTo(Person person)
    {
        return this.name.compareTo(person.name);
    }
}