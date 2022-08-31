package com.TemizlikSirketi.proje.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="employes")
public class EmployeeModel {

	
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
		
		@JoinColumn(name="user_id",insertable = false, updatable = false)
		@Column(name="user_id",nullable=false)
		Long userId;
		
		
		@Column(name="firstName",nullable=false)
		
		String firstName;
		
		@Column(name="lastName",nullable=false)
		String lastName;
		
		@Column(name="phoneNumber",nullable=false)
		String phoneNumber;
		
		@Column(name="adress",nullable=false)
		String adress;
		
		@Column(name = "isDone",nullable=false)
	    private boolean isDone;
		
		
		public EmployeeModel(boolean isDone) {
			
			this.isDone = isDone;
		}
		public boolean isDone() {
			return isDone;
		}
		public void setDone(boolean isDone) {
			this.isDone = isDone;
		}
		public EmployeeModel(String adress) {
			
			this.adress = adress;
		}
		
		public String getAdress() {
			return adress;
		}
		public void setAdress(String adress) {
			this.adress = adress;
		}
		public Long getId() {
			return id;
		}
		public void setıd(Long id) {
			this.id = id;
		}

		public Long getUserId() {
			return userId;
		}
		public void setUserId(Long userId) {
			this.userId = userId;
		}

		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		public String getPhoneNumber() {
			return phoneNumber;
		}
		public void setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
		}
		
		
}
