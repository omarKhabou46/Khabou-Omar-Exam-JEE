package ma.enset.examjee.dto;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ma.enset.examjee.entity.ContratAssurance;

import java.util.List;

@Data
public class ClientDTO {
    private Long id;
    private String nom;
    private String email;
}
