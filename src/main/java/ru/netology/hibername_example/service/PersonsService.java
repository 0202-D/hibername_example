package ru.netology.hibername_example.service;

import ru.netology.hibername_example.model.Person;

import java.util.List;

public interface PersonsService {
     List<Person> getPersonsByCity(String city);
}
