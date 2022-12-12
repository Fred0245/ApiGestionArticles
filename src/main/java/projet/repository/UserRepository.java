
package projet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import projet.models.Utilisateur;

@Repository
public interface UserRepository extends JpaRepository<Utilisateur,Long> {

    Utilisateur findByUsername(String username);
}
