package com.vimash.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name ="user_tbl")
public class User extends CommonEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long userId;
	private String loginId;
	private String fullName;
	private String email;
	private String password;
	private int numberPhone;
	private boolean role;
    
	
	
	
	
	
}
