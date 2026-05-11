package ma.enset.examjee.repository;

import ma.enset.examjee.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepo extends JpaRepository<Client, Long> {
}
