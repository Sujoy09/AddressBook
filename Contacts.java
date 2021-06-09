package com.bridgelabz;

import java.util.Scanner;

public class Contacts {
	public String firstName;
	public String lastName;
	public String address;
	public String city;
	public String state;
	public String zip;
	public String phoneNumber;
	public String email;

	public void Person(String firstName, String lastName, String address, String city, String state, String zip,
			String phoneNumber, String email) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}

	public String getfirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getlastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getaddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getcity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getstate() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getzip() {
		return zip;
	}

	public void setzip(String zip) {
		this.zip = zip;
	}

	public String getphoneNumber() {
		return phoneNumber;
	}

	public void setphoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getemail() {
		return email;
	}

	public void setemail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + ", city=" + city
				+ ", state=" + state + ", pincode=" + zip + ", phoneNumber=" + phoneNumber + ", email=" + email + "]"
				+ "\n";
	}

	public void setDetails() {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println();
			System.out.println("Add details for New person:");

			System.out.println("Enter the First Name: ");
			firstName.equals(sc.nextLine());
			System.out.println("Enter the Last Name: ");
			lastName.equals(sc.nextLine());
			System.out.println("Enter the Address: ");
			address.equals(sc.nextLine());
			System.out.println("Enter the City: ");
			city.equals(sc.nextLine());
			System.out.println("Enter the State:");
			state.equals(sc.nextLine());
			System.out.println("Enter the Zip Code:");
			zip.equals(sc.nextLine());
			System.out.println("Enter the Phone Number:");
			phoneNumber.equals(sc.nextLine());
			System.out.println("Enter the Email Address:");
			email.equals(sc.nextLine());

			sc.close();
			System.out.println();
			System.out.println("Do you want to Add another Person details? Select y/n");

			String choose = sc.nextLine();
			if (choose.equalsIgnoreCase("y")) {
				continue;
			}

			else if (choose.equalsIgnoreCase("n")) {
				System.out.println("Thank you");
				break;
			} else
				System.out.println("Invalide input");
		}
	}
}
