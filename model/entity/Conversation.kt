import com.example.ockiesaapi.enum.ConversationType
import jakarta.persistence.*

@Entity
public class Conversation(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val ConversationId: Long? = null,
    val nom : String? = null,
    @Enumerated(EnumType.STRING)
    val type: ConversationType? = null,

)

