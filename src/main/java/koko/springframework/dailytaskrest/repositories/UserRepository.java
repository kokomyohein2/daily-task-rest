package koko.springframework.dailytaskrest.repositories;

import koko.springframework.dailytaskrest.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserModel,Long> {

}
