package lt.zenitech.task.controllers;

import lt.zenitech.task.models.dto.Address;
import lt.zenitech.task.services.AddressService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/addresses")
public class AddressController {

    private final AddressService addressService;

    public AddressController(AddressService addressService) { this.addressService = addressService; }

    @GetMapping("/all")
    public List<Address> getAllAddresses() { return addressService.getAllAddresses();}

    @PostMapping
    public Address save (@RequestBody Address address) { return addressService.save(address); }

}
