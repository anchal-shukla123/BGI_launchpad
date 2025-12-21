package com.bgi.launchpad.repository;
import com.bgi.launchpad.model.Announcement;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface AnnouncementRepository extends JpaRepository<Announcement, Long> {

    List<Announcement> findByDepartmentId(Long departmentId);
}
