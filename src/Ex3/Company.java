package Ex3;

import java.util.*;

public class Company {

    private List<Person> personList;

    public Company(List<Person> personList) {
        this.personList = personList;
    }

    public List<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(List<Person> personList) {
        this.personList = personList;
    }

    public String getManager() {
        for (int i = 0; i < personList.size(); i++) {
            if (personList.get(i).getPosition().contains("manager")) {
                return personList.get(i).getName();
            }
        }
        return "not found";
    }

    public List<String> getPersons(String profession) {
        List<String> listProfession = new ArrayList<>();
        for (int i = 0; i < personList.size(); i++) {
            if (personList.get(i).getPosition().contains(profession)) {
                listProfession.add(personList.get(i).getName());
            }

        }
        return listProfession;
    }

    public List<String> getPersonsOlder(int age) {
        List<String> listPersonsOlder = new ArrayList<>();
        for (int i = 0; i < personList.size(); i++) {
            if (personList.get(i).getAge() > age) {
                listPersonsOlder.add(personList.get(i).getName());
            }
        }
        return listPersonsOlder;
    }

    public List<String> getPersonName(String filterName) {
        List<String> listNameContains = new ArrayList<>();
        for (int i = 0; i < personList.size(); i++) {
            if (personList.get(i).getName().contains(filterName)) {
                listNameContains.add(personList.get(i).getName());
            }
        }
        return listNameContains;
    }

    //verific daca mai exista manager angajat in companie
//    public boolean existManager(String position) {
//        if (personList.contains(position) && position=="manager") {
//            return true;
//        }
//        return false;
//    }

    public String employ(String nume, int age, String position) {
        Person person = new Person(nume, age, position);
        // verific in lista (personList) de obiecte(Person), daca mai am un manager
        for (Person p : personList) {
            if (position == "manager" && p.getPosition() == position) {
                return "Nu se poate adauga, deoarece exista deja un manager in companie !!!!";
            }
        }
        // Add person to list
        personList.add(0, person);
        return "A fost adaugata persoana nou angajata";
    }
}
