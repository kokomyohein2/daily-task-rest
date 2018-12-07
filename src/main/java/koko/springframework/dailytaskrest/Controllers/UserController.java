package koko.springframework.dailytaskrest.Controllers;

import koko.springframework.dailytaskrest.Services.UserService;
import koko.springframework.dailytaskrest.model.UserModel;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(UserController.BASE_URL)
public class UserController {

    public static final String BASE_URL = "/user";

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping
    public List<UserModel> userModels() {
        return userService.getAllUser();
    }

    @RequestMapping("/{id}")
    public UserModel getUserById(@PathVariable Long id) {
        return userService.getUserById(id);
    }

    @RequestMapping
    @ResponseStatus(HttpStatus.CREATED)
    public UserModel addNewUser(@RequestBody UserModel user) {
        return userService.addNewUser(user);
    }
}
