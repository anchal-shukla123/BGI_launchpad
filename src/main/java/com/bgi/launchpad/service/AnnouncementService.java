package com.bgi.launchpad.service;
import com.bgi.launchpad.model.Announcement;
import com.bgi.launchpad.repository.AnnouncementRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class AnnouncementService {
  private final AnnouncementRepository announcementRepository;

    public AnnouncementService(AnnouncementRepository announcementRepository) {
        this.announcementRepository = announcementRepository;
    }

    // Create announcement
    public Announcement createAnnouncement(Announcement announcement) {
        return announcementRepository.save(announcement);
    }

    // Get all announcements
    public List<Announcement> getAllAnnouncements() {
        return announcementRepository.findAll();
    }

    // Get announcements by department
    public List<Announcement> getByDepartment(Long departmentId) {
        return announcementRepository.findByDepartmentId(departmentId);
    }

    // Get announcement by ID
    public Optional<Announcement> getById(Long id) {
        return announcementRepository.findById(id);
    }
}
