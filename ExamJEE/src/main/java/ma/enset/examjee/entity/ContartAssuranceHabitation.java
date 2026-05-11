package ma.enset.examjee.entity;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Data;
import ma.enset.examjee.entity.enumiration.TypeLogement;

@Entity
@Data
@DiscriminatorValue("HABITATION")
public class ContartAssuranceHabitation extends ContratAssurance{
   @Enumerated(value = EnumType.STRING)
   private TypeLogement typeLogement;
   private String addresse;
   private double superficie;
}
