package com.example.conferencemay6.repositories;

import com.example.conferencemay6.models.Speaker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpeakerRepository extends JpaRepository<Speaker,Long> {
}
