package ma.enset.examjee.repository;

import ma.enset.examjee.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ClientRepo extends JpaRepository<Client, Long> {
    Client findByNom(String nom);
    List<Client> findClientsByActive(boolean b);
}
