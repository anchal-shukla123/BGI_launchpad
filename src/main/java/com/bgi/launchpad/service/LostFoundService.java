package com.bgi.launchpad.service;

import com.bgi.launchpad.model.LostFound;
import com.bgi.launchpad.repository.LostFoundRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LostFoundService {

    private final LostFoundRepository lostFoundRepository;

    public LostFoundService(LostFoundRepository lostFoundRepository) {
        this.lostFoundRepository = lostFoundRepository;
    }

    // Create lost & found item
    public LostFound createItem(LostFound item) {
        return lostFoundRepository.save(item);
    }

    // Get all items
    public List<LostFound> getAllItems() {
        return lostFoundRepository.findAll();
    }
}
