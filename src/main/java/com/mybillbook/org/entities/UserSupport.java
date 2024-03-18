package com.mybillbook.org.entities;

import java.util.Date;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="UserSupport")

public class UserSupport {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ticketNumber;
	private long phoneNumber;
	private String preferedDate;
	private String preferedTime;
	private String description;
	private Date dateSystemLocalTime;
	private int userId;

}
