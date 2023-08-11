package edu.miu.swe.eregistrar.service.impl;

import edu.miu.swe.eregistrar.model.User;
import edu.miu.swe.eregistrar.repository.UserRepository;
import edu.miu.swe.eregistrar.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = this.findByEmail(username);

        if (user == null)
            throw new UsernameNotFoundException(String.format("No user found with username '%s'", username));
        return user;
    }

    @Override
    public User findByEmail(String email) {
        User user = this.userRepository.findByEmail(email);

        if (user == null) {
            throw new UsernameNotFoundException(String.format("No user found with email '%s'", email));
        }

        return user;
    }

    @Override
    public User findById(Long id) {
        return this.userRepository.findById(id).orElse(null);
    }

}
