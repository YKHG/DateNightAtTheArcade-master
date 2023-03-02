import kotlin.random.Random

class Game(private val cost: Int) {
    fun play(card: Card) {
        if (card.credits < cost) {
            println("Not enough credits on Card #${card.id}. Game costs $cost credits, but card only has ${card.credits} credits.")
            return
        }

        card.credits -= cost
        val ticket = Random.nextInt(1,10)
        card.addTickets(ticket)

        println("Card #${card.id} played game and won $ticket tickets. Total credits: ${card.credits}, Total tickets: ${card.tickets}.")
    }
}