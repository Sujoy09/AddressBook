package com.bridgelabz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AddressBook {

	Scanner scanner = new Scanner(System.in);
	List<Contacts> personList = new ArrayList<Contacts>();

	public void add() {
		System.out.println("Enter your first name");
		String firstName = scanner.nextLine();
		System.out.println("Enter your last name");
		String lastName = scanner.nextLine();
		System.out.println("Enter your address");
		String address = scanner.nextLine();
		System.out.println("Enter your city");
		String city = scanner.nextLine();
		System.out.println("Enter your state");
		String state = scanner.nextLine();
		System.out.println("Enter your phone number");
		String phoneNumber = scanner.nextLine();
		System.out.println("Enter your zip code");
		String zipCode = scanner.nextLine();
		System.out.println("Enter your email");
		String email = scanner.nextLine();

		Contacts person1 = new Contacts(firstName, lastName, address, city, state, phoneNumber, zipCode, email);
		personList.add(person1);
		System.out.println("Contact added successfully");
	}

	public void display() {
		for (int i = 0; i < personList.size(); i++) {
			Contacts person = personList.get(i);
			System.out.println("FirstName:" + person.getfirstName() + "\n" + "LastName:" + person.getlastName() + "\n"
					+ "Adress:" + person.getaddress() + "\n" + "City:" + person.getcity() + "\n" + "State:"
					+ person.getstate() + "Phone-Number:" + person.getphoneNumber() + "\n" + "zip code:"
					+ person.getzip());
		}
	}

	public void edit(String firstName) {
		for (int i = 0; i < personList.size(); i++) {
			Contacts person = personList.get(i);
			Scanner scanner = new Scanner(System.in);

			System.out.println("Hi " + person.getfirstName() + " please enter your  new Address");
			String address = scanner.nextLine();
			person.setAddress(address);

			System.out.println("Hi " + person.getfirstName() + " please enter your  new city");
			String city = scanner.nextLine();
			person.setCity(city);

			System.out.println("Hi " + person.getfirstName() + " please enter your  new state");
			String state = scanner.nextLine();
			person.setState(state);

			System.out.println("Hi " + person.getfirstName() + " please enter your  new Zip Code");
			String zip = scanner.nextLine();
			person.setzip(zip);

			System.out.println("Hi " + person.getfirstName() + " please enter your  new Phone No");
			String PhoneNo = scanner.nextLine();
			person.setphoneNumber(PhoneNo);

			System.out.println("Hi " + person.getfirstName() + " you have sucessfully updated");
			scanner.close();
		}
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Address Book Program");

		AddressBook adressBookImplementation = new AddressBook();
		boolean condition = true;

		while (condition == true) {
			Scanner scanner = new Scanner(System.in);
			Scanner option = new Scanner(System.in);
			System.out.println("1.Add Person" + "\n" + "2.Display" + "\n" + "3.Edit person");

			switch (option.nextInt()) {
			case 1:
				adressBookImplementation.add();
				break;
			case 2:
				adressBookImplementation.display();
				break;
			case 3:
				System.out.println("Enter the firstName:");
				String firstName = scanner.nextLine();
				adressBookImplementation.edit(firstName);
				break;
			default:
				System.out.println("Thank You");
			}
			scanner.close();
			option.close();
		}
	}
}
