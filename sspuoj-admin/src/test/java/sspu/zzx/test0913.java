package sspu.zzx;



import org.jetbrains.annotations.TestOnly;
import sspu.zzx.Person;

public class test0913 {
    @TestOnly
    public static void main(String[] args) {
        Person<Integer, String> person = new Person<>();
        person.setName(1);
        person.setValue("ss");
        System.out.println(person.getName()+person.getValue());
    }
}
