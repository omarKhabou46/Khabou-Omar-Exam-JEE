package ma.enset.examjee.repository;

import ma.enset.examjee.entity.ContratAssurance;
import ma.enset.examjee.entity.Paiements;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ContratAssuranceRepo extends JpaRepository<ContratAssurance, Long> {
    List<ContratAssurance> findContratAssurancesByClientId(long id);
}
