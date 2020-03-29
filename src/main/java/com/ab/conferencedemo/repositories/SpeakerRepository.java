package com.ab.conferencedemo.repositories;

import com.ab.conferencedemo.models.Speaker;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Arpit Bhardwaj
 */
public interface SpeakerRepository extends JpaRepository<Speaker,Long> {
}
