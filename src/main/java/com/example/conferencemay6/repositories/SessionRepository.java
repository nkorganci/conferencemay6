package com.example.conferencemay6.repositories;

import com.example.conferencemay6.models.Session;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepository extends JpaRepository<Session,Long> {
}
