package com.travel.backend.controllers;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.travel.backend.entities.Payment;
import com.travel.backend.repositories.PaymentRepository;

@RestController
@RequestMapping("/payment")
@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
public class PaymentController {

	@Autowired
	private PaymentRepository paymentRepository;
	private Date date = new Date();

	@PostMapping("create-payment")
	public Payment createPayment(@RequestBody Payment payment) {
		payment.setPaymentDate(date);
		return paymentRepository.save(payment);
	}

}
