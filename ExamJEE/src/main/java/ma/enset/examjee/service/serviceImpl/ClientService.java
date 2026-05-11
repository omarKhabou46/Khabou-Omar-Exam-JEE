package ma.enset.examjee.service.serviceImpl;

import lombok.RequiredArgsConstructor;
import ma.enset.examjee.dto.ClientDTO;
import ma.enset.examjee.dto.ContratAssuranceDTO;
import ma.enset.examjee.entity.*;
import ma.enset.examjee.exception.ClientNotFoundException;
import ma.enset.examjee.mapper.ClientMapper;
import ma.enset.examjee.mapper.ContratAssuaranceMapper;
import ma.enset.examjee.repository.ClientRepo;
import ma.enset.examjee.repository.ContratAssuranceRepo;
import ma.enset.examjee.service.IClientService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ClientService implements IClientService {

    private final ClientRepo clientRepo;
    private final ClientMapper clientMapper;
    private final ContratAssuaranceMapper contratAssuaranceMapper;

    @Override
    public ClientDTO createClient(ClientDTO clientDTO) {
        Client client = clientMapper.formClientDTO(clientDTO);
        return clientMapper.fromClient(clientRepo.save(client));
    }

    @Override
    public List<ClientDTO> getAllClients() {
        List<Client> clients = clientRepo.findAll();
        return clients.stream().map(clientMapper::fromClient).toList();
    }

    @Override
    public ClientDTO getClientByNom(String nom) {
        Client client = clientRepo.findByNom(nom);
        return clientMapper.fromClient(client);
    }

    @Override
    public List<ContratAssuranceDTO> getListContratbyClientId(long clientId) {
        Client client = clientRepo.findById(clientId).orElseThrow(() -> new ClientNotFoundException("client with id " + clientId + " not found"));

        List<ContratAssurance> list = client.getContratAssuranceList();

        return list.stream().map(contrat -> {
            if (contrat instanceof ContratAssuranceAutomobile contratAssuranceAutomobile) {
                return contratAssuaranceMapper.fromContratAutomobile(contratAssuranceAutomobile);
            }else if (contrat instanceof ContratAssuranceHabitation contratAssuranceHabitation) {
                return contratAssuaranceMapper.fromContratHabitation(contratAssuranceHabitation);
            }else {
                ContratAssuranceSante contratAssuranceSante = (ContratAssuranceSante) contrat;
                return contratAssuaranceMapper.fromContratSante(contratAssuranceSante);
            }
        }).toList();
    }
}
