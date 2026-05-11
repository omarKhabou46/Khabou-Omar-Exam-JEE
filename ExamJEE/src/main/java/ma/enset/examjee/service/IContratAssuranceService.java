package ma.enset.examjee.service;

import ma.enset.examjee.dto.ContratAssuranceDTO;
import ma.enset.examjee.dto.ContratAssuranceHabitationDTO;
import ma.enset.examjee.entity.ContratAssurance;

public interface IContratAssuranceService {
    ContratAssuranceHabitationDTO createContratAssurance(ContratAssuranceHabitationDTO contratAssuranceHabitationDTO, long clientId);

}
