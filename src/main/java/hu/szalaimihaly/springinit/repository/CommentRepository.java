package hu.szalaimihaly.springinit.repository;

import hu.szalaimihaly.springinit.domain.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Long> {
}
