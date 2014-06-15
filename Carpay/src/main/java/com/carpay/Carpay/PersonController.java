package com.carpay.Carpay;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.servlet.ModelAndView;

import com.carpay.DAO.PersonDAO;
import com.carpay.DAO.VehicleDAO;
import com.carpay.Domain.PaymentCard;
import com.carpay.Domain.Person;
import com.carpay.Domain.Vehicle;


@Controller
@Scope("request")
public class PersonController {
	
	@Autowired
	private VehicleDAO vehicleDAO;
	@Autowired
	private PersonDAO personDAO;
	
	Vehicle vehicle;
	Person person;
	@RequestMapping(value="/contactInfo")
	@Transactional
	public ModelAndView personPage(HttpServletRequest request){
		ModelMap model = new ModelMap();
		//Query for vehicle based on request parameter vin
		Vehicle vehicle = vehicleDAO.getVehicleByVIN(request.getParameter("vin"));
		// If vehicle not found, return error page
		if (vehicle == null) {
			return new ModelAndView("error");
		}
		// If vehicle is not available, return reserved page
		if (!vehicle.isAvailable()) {
			return new ModelAndView("reserved");
		}
		HttpSession session = request.getSession();//sessionCreated() is executed
		//Store vehicle in session
 	    session.setAttribute("vehicle",vehicle);
		//Set vehicle in model (the data is needed to show left side pane
 	    model.put("vehicle", vehicle);
	 	return new ModelAndView("ContactInfo","Person", new Person());
	}
	
	/*@RequestMapping(value="/save", method=RequestMethod.POST) */
	/*public String save(HttpServletRequest request, @ModelAttribute("person") Person person, BindingResult result, ModelMap model) {
		HttpSession session = request.getSession();
			//validation
			new FormValidation().validate(person, result);
			String firstName = request.getParameter("firstName");
			String lastName = request.getParameter("lastName");
			String email = request.getParameter("email");
			String phoneNumber = request.getParameter("phoneNumber");
			
			
			if(result.hasErrors())
				return "ContactInfo";
			else
				// Read vehicle from session, if not not available return error
				// Save person data
				// return payment page
				
			
				session.setAttribute("pers", person);
			
			
			
		}
		model.addAttribute("id",id);
	
		return "redirect:ContactInfo.jsp";
	}*/
	
	@RequestMapping(value=("/save"), method=RequestMethod.POST) 
	public String save(HttpServletRequest request, Person person) {
		
		ModelMap model = new ModelMap();
		person.setFirstName(request.getParameter("firstName"));
		person.setLastName(request.getParameter("lastName"));
		person.setEmail(request.getParameter("email"));
		person.setPhoneNumber(request.getParameter("phoneNumber"));
		Vehicle vehicle = (Vehicle)request.getSession().getAttribute("vehicle");
		person.setVehicle(vehicle);
		personDAO.savePerson(person);
		
		//new FormValidation().validate(person);
		
		HttpSession session = request.getSession();
		session.setAttribute("person", person);
		model.put("person",person);
		return "purchase";
	}
	
	@RequestMapping(value=("/thankyou"), method=RequestMethod.POST)
	public ModelAndView purchase(HttpServletRequest request, PaymentCard pc) {
		ModelMap model = new ModelMap();
		pc.setCardType(request.getParameter("cardType"));
		pc.setCcNum(request.getParameter("ccNum"));
		pc.setPostalCode(request.getParameter("postalCode"));
		pc.setClientIP(request.getParameter("clientIP"));
		Vehicle vehicle = (Vehicle)request.getSession().getAttribute("vehicle");
		Person person = (Person)request.getSession().getAttribute("person");
		HttpSession session = request.getSession();
		session.setAttribute("payment_card", pc);
		model.put("paymentCard", pc);
		if(person.getEmail() == "demo@buyonline.com") {
		return new ModelAndView("thankyou");
		}
		return null;
		
	}
	
	
	 
		
	
}

	
	/**
	@RequestMapping(value="/save", method=RequestMethod.POST)*/
	/*public ModelAndView processPerson(@Validated@ModelAttribute("person") Person person, BindingResult result) {
		session = request.getSession();
		//((Object) session).save(person);
		Map person2 = result.getModel();
		
		//request.getSession().setAttribute('person', person);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("purchase");
		//modelAndView.addObject("pers", person);
		return modelAndView;
	}**/
	
	


