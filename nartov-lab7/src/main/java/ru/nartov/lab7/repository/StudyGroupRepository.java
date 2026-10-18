package ru.nartov.lab7.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import ru.nartov.lab7.entity.StudyGroup;
public interface StudyGroupRepository extends JpaRepository<StudyGroup,Long> { boolean existsByGroupName(String groupName); }
