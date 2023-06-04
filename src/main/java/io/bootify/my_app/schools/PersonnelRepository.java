package io.bootify.my_app.schools;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonnelRepository extends JpaRepository<SchoolPersonnel, Long> {
    List<SchoolPersonnel> findSchoolPersonnelByCounty(String county);
    List<SchoolPersonnel> findSchoolPersonnelBySchoolName(String school);
}
