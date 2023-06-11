package io.bootify.my_app.schools.pupils;

import io.bootify.my_app.schools.pupils.models.Record;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PupilRepository extends JpaRepository<Record, Long> {
    List<Record> findByJurisdictionLikeIgnoreCase(String jurisdiction);

    List<Record> findByNameLikeIgnoreCase(String school);
}
