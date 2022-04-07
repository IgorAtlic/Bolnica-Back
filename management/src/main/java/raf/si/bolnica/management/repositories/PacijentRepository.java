package raf.si.bolnica.management.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import raf.si.bolnica.management.entities.Pacijent;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface PacijentRepository extends JpaRepository<Pacijent, Long> {

    Pacijent findByLBP(UUID lbp);

    Pacijent findByPacijentId(Long Id);
}
