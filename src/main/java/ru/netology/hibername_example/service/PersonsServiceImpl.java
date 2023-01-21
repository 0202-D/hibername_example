package ru.netology.hibername_example.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.netology.hibername_example.dao.PersonsRepository;
import ru.netology.hibername_example.model.Person;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PersonsServiceImpl implements PersonsService {
    private final PersonsRepository repository;

    @Override
    public List<Person> getPersonsByCity(String city) {
        return repository.getPersonsByCity(city);

    }
}
