package hu.szalaimihaly.springinit.repository;

import hu.szalaimihaly.springinit.domain.Link;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LinkRepository extends JpaRepository<Link,Long> {

}
