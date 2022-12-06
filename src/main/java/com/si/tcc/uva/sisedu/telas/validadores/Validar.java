package com.si.tcc.uva.sisedu.telas.validadores;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lferreira
 */
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;

import com.google.i18n.phonenumbers.PhoneNumberUtil;
import com.google.i18n.phonenumbers.Phonenumber.PhoneNumber;

import br.com.caelum.stella.validation.CPFValidator;

public class Validar {

	public boolean isValidCPF(String cpf) {
		CPFValidator cpfValidator = new CPFValidator();
		try {
			cpfValidator.assertValid(cpf);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean isValidEmailAddress(String email) {

		try {
			InternetAddress emailAddr = new InternetAddress(email);
			//System.out.println(email);
			emailAddr.validate();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean isValidPhoneNumber(String phone) {
		PhoneNumberUtil phoneUtil = PhoneNumberUtil.getInstance();

		try {
			PhoneNumber phoneNumber = phoneUtil.parse(phone, "BR");
			phoneUtil.isValidNumber(phoneNumber);
			//System.out.print(phoneUtil.isValidNumber(phoneNumber));
			return phoneUtil.isValidNumber(phoneNumber); 
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		
	}

}

