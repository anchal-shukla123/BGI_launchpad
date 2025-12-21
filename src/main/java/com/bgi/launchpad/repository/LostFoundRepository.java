package com.bgi.launchpad.repository;

import com.bgi.launchpad.model.LostFound;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LostFoundRepository extends JpaRepository<LostFound, Long> {
}
