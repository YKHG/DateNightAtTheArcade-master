
// The PrizeCategory class represents a category of prize that a user can claim.
// It contains information about the name of the prize, the number of tickets required to claim it,
// and the count of how many items of this category remain in the terminal.
class PrizeCategory(val name: String, val ticketsRequired: Int, var count: Int) {
    fun claim(card: Card) {
        if (card.tickets >= ticketsRequired) {
            card.tickets -= ticketsRequired
            count -= 1
            println("Prize ($name) claimed with Card #${card.id}. Total tickets: ${card.tickets}")
        } else {
            println("Not enough tickets on Card #${card.id} to claim prize ($name). Need $ticketsRequired tickets, but only has ${card.tickets}")
        }
    }
}