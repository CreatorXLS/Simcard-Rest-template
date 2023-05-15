package com.SimCardActivator.SimCardActivator.repository;

import com.SimCardActivator.SimCardActivator.model.SimCard;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SimRepository extends JpaRepository<SimCard, String> {
}
