package com.example.flight_booking.flight_booking.ServiceImplementation;

import com.example.flight_booking.flight_booking.BookingRepository.UserRepository;
import com.example.flight_booking.flight_booking.DAOModel.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


import java.util.Arrays;
import java.util.stream.Collectors;

@Service
public class CustomUserDetailsService implements UserDetailsService {
    @Autowired
    private UserRepository userRepository;


    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        User user = userRepository.findFirstByEmail(email);
        if (user == null) {
            throw new UsernameNotFoundException("User not found");
        }
        return new CustomUser(user); // Create a CustomUser object using the retrieved User
    }
}
