import jakarta.persistence.*
import java.util.Date

// Les modèles représentent comment la donnée va être construite/ représentée
@Entity
@Table(name = "message")
class Message(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val messageId: Int? = null,
    val contenu : String? = null,
    val type: EnumType? = null,
    val horodatage : Date? = null,
    @ManyToOne
    @JoinColumn(name="fk_utilisateur_id")
    val utilisateur : Utilisateur? = null,
    @ManyToOne
    @JoinTable(name = "fk_conversation_utilisateur_id")
    val conversation : Conversation? = null

)