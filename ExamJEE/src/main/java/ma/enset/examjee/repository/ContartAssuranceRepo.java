package ma.enset.examjee.repository;

import ma.enset.examjee.entity.Paiements;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContartAssuranceRepo extends JpaRepository<Paiements, Long> {
}
