package services;

import dtos.CustomerRequestDto;
import dtos.KindOfRequestDto;
import entities.CustomerRequestEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import repositories.CustomerRequestRepository;
import repositories.KindOfRequestRepository;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Component
public class ServiceApplication {

    @Autowired
    private KindOfRequestRepository kindOfRequestRepository;

    @Autowired
    CustomerRequestRepository customerRequestRepository;

    private static final int MAX_LENGTH_REQUEST = 100;

    @Transactional
    public CustomerRequestEntity insertCustomerMessageToDatabase(CustomerRequestDto customerRequestDto) throws Exception {
        if (customerRequestDto.getRequestMessage().length() > MAX_LENGTH_REQUEST ) {
            throw new Exception("Délka zprávy je delší než "+ MAX_LENGTH_REQUEST + " znaků. Zpráva nebyla uložena");
        }
        CustomerRequestEntity entity = new CustomerRequestEntity();
        entity.setKindOfRequestId(customerRequestDto.getKindOfRequestId());
        entity.setName(customerRequestDto.getName());
        entity.setSurname(customerRequestDto.getSurname());
        entity.setPolicyNumber(customerRequestDto.getPolicyNumber());
        entity.setRequestMessage(customerRequestDto.getRequestMessage());return customerRequestRepository.save(entity);
    }

    public List<KindOfRequestDto> getAllMenuItems() {
        List<KindOfRequestDto> output =  new ArrayList<>();
        kindOfRequestRepository.findAll().forEach(e -> output.add(e.convertoToDto()));
        return output;
    }

}

