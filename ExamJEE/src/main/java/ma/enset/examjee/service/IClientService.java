package ma.enset.examjee.service;

import ma.enset.examjee.dto.ClientDTO;
import ma.enset.examjee.dto.ContratAssuranceDTO;

import java.util.List;

public interface IClientService {
    ClientDTO createClient(ClientDTO clientDTO);
    List<ClientDTO> getAllClients();
    ClientDTO getClientByNom(String nom);
    List<ContratAssuranceDTO> getListContratbyClientId(long clientId);
}
