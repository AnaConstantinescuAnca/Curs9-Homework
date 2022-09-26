package Ex2;

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
            if (personList.get(i).getPosition() == "manager") {
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

    public String employ(String nume, int age, String position) {
        Person person  = new Person(nume,age,position);

        if (position == "manager") {
            return "Nu se poate adauga persoana !!!!";
        } else {
            personList.add(0,person);
        }
        return  "A fost add persoana";
    }
}
