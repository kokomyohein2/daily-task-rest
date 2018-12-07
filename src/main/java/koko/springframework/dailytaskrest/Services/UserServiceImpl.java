package koko.springframework.dailytaskrest.Services;

import koko.springframework.dailytaskrest.model.UserModel;
import koko.springframework.dailytaskrest.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserModel getUserById(Long id) {
        return userRepository.findById(id).orElse(new UserModel());
    }

    @Override
    public List<UserModel> getAllUser() {
        return userRepository.findAll();
    }

    @Override
    public UserModel addNewUser(UserModel user) {
        return userRepository.save(user);
    }
}
