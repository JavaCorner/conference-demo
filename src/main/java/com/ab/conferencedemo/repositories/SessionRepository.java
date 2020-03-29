package com.ab.conferencedemo.repositories;

import com.ab.conferencedemo.models.Session;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Arpit Bhardwaj
 */
public interface SessionRepository extends JpaRepository<Session, Long> {
}
