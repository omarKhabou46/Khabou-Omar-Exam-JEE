package ma.enset.examjee.entity;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Data;
import ma.enset.examjee.entity.enumiration.NiveauCouverture;
import ma.enset.examjee.entity.enumiration.TypeLogement;

@Entity
@Data
@DiscriminatorValue("SANTE")
public class ContratAssuranceSante extends ContratAssurance{
   @Enumerated(value = EnumType.STRING)
   private NiveauCouverture niveauCouverture;
   private int nbPersonne;
}
