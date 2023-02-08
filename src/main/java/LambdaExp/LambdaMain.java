package LambdaExp;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaMain {

    @FunctionalInterface
    interface checkPerson{
        boolean test (Person p);
    }

    static class CheckPersonEligibleForSelectiveSearch implements checkPerson{

        @Override
        public boolean test(Person p) {
            return p.gender == Person.Sex.MALE && p.getAge() >=18 && p.getAge() <=25;
        }

    }
    public static void printPersonOlderThan(List<Person> people, int age){
        for(Person p : people){
            if(p.getAge()>=age){
                p.printPerson();
            }
        }
    }

    public static void printPersonWithinAgeResponse(List<Person> people, int low, int high){
        for(Person p : people){
            if(low<=p.getAge() && p.getAge() < high){
                p.printPerson();
            }
        }
    }

    public static void printPeople(List<Person> people, checkPerson tester){
        for(Person p : people){
            if(tester.test(p)){
                p.printPerson();
            }
        }
    }

    //Predicate is default Functional interface with SAM test method
    public static void printPeopleWithPredicate(List<Person> people, Predicate<Person> tester){
        for(Person p : people){
            if(tester.test(p)){
                p.printPerson();
            }
        }
    }

    public static void main(String[] args) {
        List<Person> personList = Person.generateDefaultList();
        //printPersonWithinAgeResponse(personList,19,25);
        //printPeople(personList, new CheckPersonEligibleForSelectiveSearch());

        //Default implementation
        printPeople(personList, new checkPerson() {
            @Override
            public boolean test(Person p) {
                return p.gender == Person.Sex.MALE && p.getAge() >=18 && p.getAge() <=25;
            }
        });

        //Lambda Expression
        printPeople(personList, (Person p) -> {
            return p.gender == Person.Sex.MALE && p.getAge() >= 18 && p.getAge() <= 25;
        });

        //Default Functional interface with lambda expre.. Predicate is default Functional interface with only "test" method
        printPeopleWithPredicate(personList, p -> p.gender == Person.Sex.MALE && p.getAge() >= 18 && p.getAge() <= 25);

        //Funtion Interface lamda
        Function<String,String> toUpperCaseLambda = (s)->s.toUpperCase();
        System.out.println(toUpperCaseLambda.apply("strtyu"));

        Supplier<String> sp = String::new;

    }
}
