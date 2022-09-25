package com.ishika.ProductManager;

import java.util.Collection;
import java.util.Collections;
import java.util.*;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class UserPrinciple implements UserDetails {


	private Employee user;
	
	public UserPrinciple(Employee user) {
		this.user = user;
	}
	
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		
		List<GrantedAuthority> authorities = new ArrayList<>();

       
        // Extract list of roles (ROLE_name)
        this.user.getRoleList().forEach(r -> {
            GrantedAuthority authority = new SimpleGrantedAuthority("ROLE_" + r);
            authorities.add(authority);
        });

        return authorities;
					
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return user.getEmpwd();
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return user.getEmpname();
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

}
