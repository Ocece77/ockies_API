import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

//Utilisés pour interagir avec la base de données à l'aide de Spring Data JPA.


@Repository
abstract class ConversationDAO : JpaRepository<Conversation, Long> {
}