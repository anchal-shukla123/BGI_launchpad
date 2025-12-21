package com.bgi.launchpad.repository;
import com.bgi.launchpad.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import java.time.LocalDate;
import java.util.List;

public interface EventRepository extends JpaRepository<Event, Long> {

    List<Event> findByEventDate(LocalDate eventDate);
}
