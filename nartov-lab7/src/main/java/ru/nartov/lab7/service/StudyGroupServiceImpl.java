package ru.nartov.lab7.service;
import org.springframework.stereotype.Service;import org.springframework.transaction.annotation.Transactional;
import ru.nartov.lab7.entity.StudyGroup;import ru.nartov.lab7.repository.StudyGroupRepository;import java.util.List;
@Service @Transactional public class StudyGroupServiceImpl implements StudyGroupService {
 private final StudyGroupRepository repository;public StudyGroupServiceImpl(StudyGroupRepository repository){this.repository=repository;}
 @Transactional(readOnly=true) public List<StudyGroup> findAll(){return repository.findAll();}
 @Transactional(readOnly=true) public StudyGroup findById(Long id){return repository.findById(id).orElseThrow(()->new IllegalArgumentException("Группа с id="+id+" не найдена"));}
 public StudyGroup save(StudyGroup group){return repository.save(group);}
 public void deleteById(Long id){if(!repository.existsById(id))throw new IllegalArgumentException("Группа с id="+id+" не найдена");repository.deleteById(id);}
}
