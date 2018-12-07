package koko.springframework.dailytaskrest.Services;

import koko.springframework.dailytaskrest.model.UserModel;

import java.util.List;

public interface UserService {

    UserModel getUserById(Long id);

    List<UserModel> getAllUser();

    UserModel addNewUser(UserModel userModel);
}
