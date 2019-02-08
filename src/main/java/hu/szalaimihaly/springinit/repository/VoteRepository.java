package hu.szalaimihaly.springinit.repository;

import hu.szalaimihaly.springinit.domain.Vote;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VoteRepository extends JpaRepository<Vote,Long> {


}
