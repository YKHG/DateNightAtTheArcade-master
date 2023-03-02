
// Class representing a card that holds credits and tickets
class Card {
    val id: Int = nextId++
    var credits: Int = 0
    var tickets: Int = 0

    companion object {
        private var nextId = 1
        const val CREDITS_PER_DOLLAR = 2
    }

    fun addCredits(amount: Int) {
        credits += amount
        println("$amount credits added to Card #$id. Total credits: $credits")
    }

    fun addTickets(amount: Int) {
        tickets += amount
        println("$amount tickets added to Card #$id. Total tickets: $tickets")
    }
}