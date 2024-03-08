package fit.iuh.edu.vn.springbootkt.repositories;

import fit.iuh.edu.vn.springbootkt.entities.Waterbill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WaterBillRepositories extends JpaRepository<Waterbill, String> {
}
