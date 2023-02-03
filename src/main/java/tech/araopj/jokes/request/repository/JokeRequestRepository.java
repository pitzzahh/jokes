package tech.araopj.jokes.request.repository;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import tech.araopj.jokes.request.entity.JokeRequest;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface JokeRequestRepository extends JpaRepository<JokeRequest, Integer> {


    @Query("SELECT j FROM joke_requests j WHERE j.joke LIKE ?1 OR j.joke = ?1")
    Optional<JokeRequest> findJokeRequestByJoke(String joke);

    @Transactional
    @Modifying
    @Query("DELETE FROM joke_requests j WHERE j.id = ?1")
    int deleteJokeRequestById(long id);

}