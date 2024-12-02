import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository


@Repository
abstract class MediaDAO : JpaRepository<Media, Long>{
}