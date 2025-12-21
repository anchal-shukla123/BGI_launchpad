package com.bgi.launchpad.controller;
import com.bgi.launchpad.model.Event;
import com.bgi.launchpad.service.EventService;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/events")
public class EventController {
  private final EventService eventService;

    public EventController(EventService eventService) {
        this.eventService = eventService;
    }

    // CREATE EVENT
    @PostMapping
    public ResponseEntity<Event> create(@RequestBody Event event) {
        return ResponseEntity.ok(
                eventService.createEvent(event)
        );
    }

    // GET ALL EVENTS
    @GetMapping
    public ResponseEntity<List<Event>> getAll() {
        return ResponseEntity.ok(
                eventService.getAllEvents()
        );
    }

    // GET EVENTS BY DATE
    @GetMapping("/date/{date}")
    public ResponseEntity<List<Event>> getByDate(
            @PathVariable @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate date) {

        return ResponseEntity.ok(
                eventService.getEventsByDate(date)
        );
    }
}
