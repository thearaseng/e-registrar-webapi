package edu.miu.swe.eregistrar.service;
import edu.miu.swe.eregistrar.model.User;
import org.springframework.security.core.userdetails.UserDetailsService;


public interface UserService extends UserDetailsService {
    User findByEmail(String email);
    User findById(Long id);
}
