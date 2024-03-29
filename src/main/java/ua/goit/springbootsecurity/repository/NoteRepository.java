package ua.goit.springbootsecurity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.goit.springbootsecurity.model.Note;

@Repository
public interface NoteRepository extends JpaRepository<Note, Long> {
}
