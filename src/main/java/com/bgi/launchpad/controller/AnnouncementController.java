package com.bgi.launchpad.controller;
import com.bgi.launchpad.model.Announcement;
import com.bgi.launchpad.service.AnnouncementService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/announcements")
public class AnnouncementController {
  private final AnnouncementService announcementService;

    public AnnouncementController(AnnouncementService announcementService) {
        this.announcementService = announcementService;
    }

    // CREATE ANNOUNCEMENT
    @PostMapping
    public ResponseEntity<Announcement> create(@RequestBody Announcement announcement) {
        return ResponseEntity.ok(
                announcementService.createAnnouncement(announcement)
        );
    }

    // GET ALL ANNOUNCEMENTS
    @GetMapping
    public ResponseEntity<List<Announcement>> getAll() {
        return ResponseEntity.ok(
                announcementService.getAllAnnouncements()
        );
    }

    // GET ANNOUNCEMENTS BY DEPARTMENT
    @GetMapping("/department/{departmentId}")
    public ResponseEntity<List<Announcement>> getByDepartment(
            @PathVariable Long departmentId) {

        return ResponseEntity.ok(
                announcementService.getByDepartment(departmentId)
        );
    }
}
