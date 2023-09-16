package tn.Spring.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

import tn.Spring.Entity.ERole;
import tn.Spring.Entity.Role;
@Repository
public interface RoleRepository extends CrudRepository<Role, Integer> {
	Optional<Role> findByName(ERole name);

}
