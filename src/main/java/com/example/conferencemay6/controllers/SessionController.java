package com.example.conferencemay6.controllers;

import com.example.conferencemay6.models.Session;
import com.example.conferencemay6.repositories.SessionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/sessions")
public class SessionController {

    @Autowired
    private SessionRepository sessionRepository;

    @GetMapping
    public List<Session> get() {
        return sessionRepository.findAll();
    }

    @GetMapping
    @RequestMapping("{id}")
    public Optional<Session> get (@PathVariable Long id){
        return sessionRepository.findById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Session create(@RequestBody final Session session){

        return sessionRepository.save(session);
    }

    @DeleteMapping
    public void deelete(@PathVariable Long id){
        sessionRepository.deleteById(id);
    }
}
