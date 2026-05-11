package ma.enset.examjee.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ma.enset.examjee.entity.enumiration.StatusContrat;

import java.time.LocalDate;
import java.util.List;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "type", length = 30)
public class ContratAssurance {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate dateSouscription;
    @Enumerated(value = EnumType.STRING)
    private StatusContrat statusContrat;
    private LocalDate dateValidation;
    private double montantCotisation;
    private int dureeContart;
    private double tauxCouverture;
    @ManyToOne
    private Client client;
    @OneToMany(mappedBy = "paiement")
    private List<Paiements> paiementsList;
}


//