package com.spring.auth_server.service;

import com.spring.auth_server.model.MyUserDetails;
import com.spring.auth_server.model.Role;
import com.spring.auth_server.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    UserService userService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userService.getUser(username);
        Set<SimpleGrantedAuthority> authorities = new HashSet<>();
        Set<Role> roles = user.getRoles();
        for (Role role:roles){
            authorities.add(new SimpleGrantedAuthority(role.getName()));
        }

        return new MyUserDetails(user.getUsername(), user.getPassword(), true,authorities);

    }
}
