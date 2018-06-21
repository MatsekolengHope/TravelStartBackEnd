package com.travel.backend.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.travel.backend.entities.Address;
import com.travel.backend.service.AddressService;

@RestController
@RequestMapping("/address")
@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
public class AddressController {

	@Autowired
	private AddressService addressService;

	@PostMapping("/add")
	public Address add(@RequestBody Address address) {
		return addressService.add(address);
	}

	@PutMapping("/update")
	public Address update(@RequestBody Address address) {
		return addressService.update(address);
	}
	
	@DeleteMapping("/delete")
	public void delete(@RequestBody Address address) {
		addressService.delete(address);
	}
	
	@GetMapping("/get-by-id/{id}")
	public List<Address> getAddresses(@PathVariable Long id) {
		return addressService.getAddresses(id);
	}
}
