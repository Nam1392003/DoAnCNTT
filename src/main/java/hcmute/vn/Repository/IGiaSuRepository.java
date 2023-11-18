package hcmute.vn.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import hcmute.vn.Entity.GiaSu;

@Repository

public interface IGiaSuRepository extends JpaRepository<GiaSu, Integer>{

}
