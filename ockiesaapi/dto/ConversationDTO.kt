//Les DTOs facilitent la communication entre le backend et les clients (API).
class Conversation(
    val ConversationId: Long?,
    val nom : String?,
    val type: com.example.ockiesaapi.enum.ConversationType?
)
{}