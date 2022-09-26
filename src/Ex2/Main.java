package Ex2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Person person = new Person("Popescu", 38, "manager");
        Person person1 = new Person("Ionescu", 44, "plummer");
        Person person2 = new Person("Vasilescu", 40, "welder");
        Person person3 = new Person("Mihalache", 36, "carpenter");
        Person person4 = new Person("Anton", 29, "plummer");

        List<Person> personList = new ArrayList<>();
        personList.add(person);
        personList.add(person1);
        personList.add(person2);
        personList.add(person3);
        personList.add(person4);


        Company company = new Company(personList);
        //System.out.println(company.getPersonList().get(0).getName());
        //lista personal companie
        //System.out.println("Lista personal Company : " + company.getPersonList().get(0).getName());
        //System.out.println("Lista personal Company : " + it.next().getName());
        //
        for(Person angajat: company.getPersonList()){
            System.out.println(String.format("Angajatul %s in varsata de %d are functia de %s",
                    angajat.getName(), angajat.getAge(), angajat.getPosition()));
        }

        // cine este manager
        System.out.println(String.format("Name of Manager is %s", company.getManager()));

        //lista cu numele celor care sunt de profesie instalatori
        System.out.println("Lista instalatori " + company.getPersons("plummer"));

        //lista persoanelor cu varsta >=40
        System.out.println("Lista persoanelor cu varsta >36 ani: " + company.getPersonsOlder(36));

        // lista persoanelor al caror nume contine "escu"
        System.out.println("Lista persoanelor al caror nume contine 'escu' este: " + company.getPersonName("escu"));

        //adaug persoana nou angajata
        //);
        //System.out.println(company.employ("Popa",33,"carpenter"));
        System.out.println(company.employ("Popa", 33, "manager"));
        System.out.println(company.employ("Popa", 33, "carpenter"));

    }
}
