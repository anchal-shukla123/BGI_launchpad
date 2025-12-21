package com.bgi.launchpad.controller;

import com.bgi.launchpad.model.LostFound;
import com.bgi.launchpad.service.LostFoundService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/lost-found")
public class LostFoundController {

    private final LostFoundService lostFoundService;

    public LostFoundController(LostFoundService lostFoundService) {
        this.lostFoundService = lostFoundService;
    }

    // CREATE LOST & FOUND ITEM
    @PostMapping
    public ResponseEntity<LostFound> create(@RequestBody LostFound item) {
        return ResponseEntity.ok(
                lostFoundService.createItem(item)
        );
    }

    // GET ALL LOST & FOUND ITEMS
    @GetMapping
    public ResponseEntity<List<LostFound>> getAll() {
        return ResponseEntity.ok(
                lostFoundService.getAllItems()
        );
    }
}
