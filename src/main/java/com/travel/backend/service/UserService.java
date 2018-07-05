package com.travel.backend.service;

import java.util.ArrayList;
import java.util.List;

import javax.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.travel.backend.email.ContactUs;
import com.travel.backend.email.ContactUsEmailSend;
import com.travel.backend.email.ForgortenPasswordEmailSend;
import com.travel.backend.entities.traveller.Traveller;
import com.travel.backend.entities.user.User;
import com.travel.backend.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private ForgortenPasswordEmailSend emailSend;
	
	@Autowired
	private ContactUsEmailSend contactUsEmailSend;

	public User createTraveller(Traveller traveller) {
		traveller.setRole("Traveller");
		return userRepository.save(traveller);
	}

	public List<User> getAllTravellers() {
		List<User> travellers = new ArrayList<>();

		for (int index = 0; index < userRepository.findAll().size(); index++) {
			if (userRepository.findAll().get(index).getRole().equals("Traveller")) {
				travellers.add(userRepository.findAll().get(index));
			}
		}

		return travellers;
	}

	public User login(String email, String password) {

		User targetuser = new User();

		for (int index = 0; index < userRepository.findAll().size(); index++) {
			if (userRepository.findAll().get(index).getEmail().equals(email)
					&& userRepository.findAll().get(index).getPassword().equals(password)) {
				targetuser = userRepository.findAll().get(index);
				break;
			}
		}

		return targetuser;
	}

	public boolean deleteUser(Long id) {
		User user = new User();

		for (int x = 0; x < userRepository.findAll().size(); x++) {
			if (userRepository.findAll().get(x).getId() == id) {
				user = userRepository.findAll().get(x);
				userRepository.delete(user);
				break;
			}
		}
		return true;
	}

	public User updateUser(Traveller user) {
		return userRepository.save(user);

	}

	public User getUser(Long id) {

		User targetUser = null;

		for (User user : userRepository.findAll()) {
			if (user.getId() == id) {
				targetUser = user;
				break;
			}
		}

		return targetUser;
	}

	public String passwordRetrieve(String email) throws MessagingException {
		String body = "";
		String result = "Failure";
		for (User user : userRepository.findAll()) {
			if (user.getEmail().equals(email)) {
				body += "Hi " + user.getFirstname() + " " + user.getLastname() + ",<br><br>" + "Password requested: "
						+ user.getPassword() + "<br><br>Thanks for choosing Travelstart." + "<br><br>"
						+ "Kind regards, <br> Travelstart Security Team";

				emailSend.send(email, "Password Requested", body);
				result = "Success";
				break;
			}
		}
		return result;
	}
	
	public String contactUs(ContactUs contactUs) throws MessagingException {
		contactUsEmailSend.send(contactUs);
		return "Sending...";
	}

}
