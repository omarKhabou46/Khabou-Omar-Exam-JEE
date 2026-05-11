package ma.enset.examjee.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ma.enset.examjee.entity.enumiration.TypePaiement;

import java.time.LocalDate;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class Paiements {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate date;
    @Enumerated(value = EnumType.STRING)
    private TypePaiement typePaiement;
    @ManyToOne
    private Paiements paiement;
}
