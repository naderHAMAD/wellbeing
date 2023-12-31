package tn.Spring.Repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.Spring.Entity.User;


@Repository
public interface UserRepository extends CrudRepository<User, Integer> {

	Optional<User> findByUsername(String username);

	Boolean existsByEmail(String email);

	Optional<User> findByEmail(String email);

	Boolean existsByUsername(String username);

	// Optional<Property> findById(Integer user);

	Optional<User> findById(Integer idUser);

}
