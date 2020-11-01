package rest;

import dtos.CustomerRequestDto;
import dtos.KindOfRequestDto;
import entities.CustomerRequestEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import services.ServiceApplication;

import java.util.List;

@RestController
public class ApplicationController {

	@Autowired
	private ServiceApplication serviceApplication;

	@RequestMapping("/insertCustomerRequest")
	public CustomerRequestEntity insertCustomerRequest(@RequestBody CustomerRequestDto customerRequestDto) throws Exception {
		return serviceApplication.insertCustomerMessageToDatabase(customerRequestDto);
	}

	@RequestMapping ("/getMenuItems")
	public List<KindOfRequestDto> getAllMenuItems () {
		return serviceApplication.getAllMenuItems();
	}
}
