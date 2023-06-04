package io.bootify.my_app.schools.personnel;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonnelRepository extends JpaRepository<SchoolPersonnel, Long> {
    List<SchoolPersonnel> findRecordByCountyLikeIgnoreCase(String county);
    List<SchoolPersonnel> findSchoolPersonnelBySchoolNameLikeIgnoreCase(String school);
}
