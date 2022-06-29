package nextstep.subway.line.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface LineRepository extends JpaRepository<Line, Long> {

    // 임시 삭제 WHERE SLEEP(3)
    @Query(value = "SELECT * FROM line", nativeQuery = true)
    List<Line> findAll();
}
