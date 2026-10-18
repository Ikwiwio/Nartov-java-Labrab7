package ru.nartov.lab7.service;
import ru.nartov.lab7.entity.StudyGroup;import java.util.List;
public interface StudyGroupService {List<StudyGroup> findAll();StudyGroup findById(Long id);StudyGroup save(StudyGroup group);void deleteById(Long id);}
