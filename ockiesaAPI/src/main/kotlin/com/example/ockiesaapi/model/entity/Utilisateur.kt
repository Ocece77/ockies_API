import jakarta.persistence.*

// Les modèles représentent comment la donnée va être construite/ représentée
@Entity
class Utilisateur (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val UtilisateurId: Long = 0,
    val avatar: String? = null,
    val nom: String? = null,
    val statut: String? = null,
    val activite : String? = null,
    val etatEnLigne : String? = null,
)