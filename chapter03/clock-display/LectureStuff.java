
/**
 * Write a description of class LectureStuff here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LectureStuff
{
    
        public void printOutput(){
            int a ;
            int b;
            a = 32;
            b = a; 
            a = a +1; 
            System.out.println(b);
        }
        
        public void printOtherOutput(){
            Person a;
            Person b;
            a = createPerson("Esp1");
            b = a;
            System.out.println(a.getName());
            System.out.println(b.getName());
        }
        
        private Person createPerson(String name)
        {
            Person person = new Person();
            person.changeName(name);
            return person;
        }
}

