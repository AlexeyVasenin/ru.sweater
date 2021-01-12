package ru.example.sweater.domain.repos;

import org.springframework.data.repository.CrudRepository;
import ru.example.sweater.domain.Message;

public interface MessageRepo extends CrudRepository<Message, Long> {
}
