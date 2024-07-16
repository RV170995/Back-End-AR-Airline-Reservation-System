package com.airlinerreservationsystem.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserAuth {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long userId;
	private String userName;
	private String password;
	private String role;

	
	public UserAuth(String userName, String password, String role) {
		this.userName = userName;
		this.password = password;
		this.role = role;
	}

//	@Override
//	public Collection<? extends GrantedAuthority> getAuthorities() {
//		List<SimpleGrantedAuthority> authorities = new ArrayList<SimpleGrantedAuthority>();
//		authorities.add(new SimpleGrantedAuthority(this.role));
//		return authorities;
//	}
//
//	@Override
//	public String getUsername() {
//		return this.userName;
//	}
}
