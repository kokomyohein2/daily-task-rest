package koko.springframework.dailytaskrest.bootstraps;

import koko.springframework.dailytaskrest.model.UserModel;
import koko.springframework.dailytaskrest.repositories.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootstrapUserData implements CommandLineRunner {

    private final UserRepository userRepository;

    public BootstrapUserData(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        System.out.println("String add user");

        UserModel u1 = new UserModel();
        u1.setFirstname("koko");
        u1.setLastname("myo");
        userRepository.save(u1);

        UserModel u2 = new UserModel();
        u2.setFirstname("chit");
        u2.setLastname("lay");
        userRepository.save(u2);

        System.out.println("Total added user : "+ userRepository.count());
    }
}
