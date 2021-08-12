package leoreboucas.com.tellme.repository;

import leoreboucas.com.tellme.model.Weakness;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WeaknessRepository extends CrudRepository<Weakness, Long> {

}
