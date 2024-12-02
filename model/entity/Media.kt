import jakarta.persistence.*

@Entity
@Table(name = "media")
class Media (
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    val mediaId: Long = 0 ,
    val lien : String? = null,
    @ManyToOne
    @JoinColumn(name="fk_message_id")
    val message: Message? = null,

)