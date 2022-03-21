package com.project.transactionDetail;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;


//Moodel class   
@Entity
@Table(name = "td")
public class Td 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name ="Id")
	int Id;
	
	@Column(name = "Account_Number")
	long Account_Number;
	
	@Column(name = "Account_Name")
	String Account_Name;
	
	@Column(name= "Bank_Id")
	int Bank_Id;
	
	@Column(name = "Bank_Name")
	String Bank_Name;
	
	@Column(name = "Transaction_Id")
	String Transaction_Id;
	
	@Column(name = "Amount")
	double Amount;
	
	@Column(name = "Receiver_Account_Number")
	long Receiver_Account_Number;
	
	@Column(name = "Receiver_Account_Name")
	String Receiver_Account_Name;
	
	@Column(name = "Status")
	String Status;
	
	@Column(name = "Date")
	String Date;
	
	public Td()
	{
		
	}

	public Td(int id, long account_Number, String account_Name, int bank_Id, String bank_Name, String transaction_Id,
			double amount, long receiver_Account_Number, String receiver_Account_Name, String status, String date) {
		super();
		Id = id;
		Account_Number = account_Number;
		Account_Name = account_Name;
		Bank_Id = bank_Id;
		Bank_Name = bank_Name;
		Transaction_Id = transaction_Id;
		Amount = amount;
		Receiver_Account_Number = receiver_Account_Number;
		Receiver_Account_Name = receiver_Account_Name;
		Status = status;
		Date = date;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public long getAccount_Number() {
		return Account_Number;
	}

	public void setAccount_Number(long account_Number) {
		Account_Number = account_Number;
	}

	public String getAccount_Name() {
		return Account_Name;
	}

	public void setAccount_Name(String account_Name) {
		Account_Name = account_Name;
	}

	public int getBank_Id() {
		return Bank_Id;
	}

	public void setBank_Id(int bank_Id) {
		Bank_Id = bank_Id;
	}

	public String getBank_Name() {
		return Bank_Name;
	}

	public void setBank_Name(String bank_Name) {
		Bank_Name = bank_Name;
	}

	public String getTransaction_Id() {
		return Transaction_Id;
	}

	public void setTransaction_Id(String transaction_Id) {
		Transaction_Id = transaction_Id;
	}

	public double getAmount() {
		return Amount;
	}

	public void setAmount(double amount) {
		Amount = amount;
	}

	public long getReceiver_Account_Number() {
		return Receiver_Account_Number;
	}

	public void setReceiver_Account_Number(long receiver_Account_Number) {
		Receiver_Account_Number = receiver_Account_Number;
	}

	public String getReceiver_Account_Name() {
		return Receiver_Account_Name;
	}

	public void setReceiver_Account_Name(String receiver_Account_Name) {
		Receiver_Account_Name = receiver_Account_Name;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}

	public String getDate() {
		return Date;
	}

	public void setDate(String date) {
		Date = date;
	}
	
	

	

}
