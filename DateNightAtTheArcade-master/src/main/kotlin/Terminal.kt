class Terminal {

    private val creditsToDollarsRatio = 2 // 2 credits per $1

    // Prize categories
    private val candy = PrizeCategory("Candy", 10, 5)
    private val hat = PrizeCategory("Hat", 20, 3)
    private val glasses = PrizeCategory("Glasses", 30, 2)

    fun addCredits(card: Card, amount: Int) {
        card.credits += amount
        println("$amount credits added to Card #${card.id}. Total credits: ${card.credits}")
    }

    fun transferCredits(cardFrom: Card, cardTo: Card) {
        val credits = cardFrom.credits
        cardFrom.credits = 0
        cardTo.credits += credits
        println("$credits credits transferred from Card #${cardFrom.id} to Card #${cardTo.id}")
    }

    fun transferTickets(cardFrom: Card, cardTo: Card) {
        val tickets = cardFrom.tickets
        cardFrom.tickets = 0
        cardTo.tickets += tickets
        println("$tickets tickets transferred from Card #${cardFrom.id} to Card #${cardTo.id}")
    }

    fun requestPrize(prize: String, card: Card) {
        when (prize) {
            candy.name -> {
                if (candy.count > 0) {
                    if (card.tickets >= candy.ticketsRequired) {
                        candy.claim(card)
                    } else {
                        println("Not enough tickets on Card #${card.id} to claim prize (${candy.name}). Need ${candy.ticketsRequired} tickets, but only has ${card.tickets}")
                    }
                } else {
                    println("No more ${candy.name} left in the terminal.")
                }
            }
            hat.name -> {
                if (hat.count > 0) {
                    if (card.tickets >= hat.ticketsRequired) {
                        hat.claim(card)
                    } else {
                        println("Not enough tickets on Card #${card.id} to claim prize (${hat.name}). Need ${hat.ticketsRequired} tickets, but only has ${card.tickets}")
                    }
                } else {
                    println("No more ${hat.name} left in the terminal.")
                }
            }
            glasses.name -> {
                if (glasses.count > 0) {
                    if (card.tickets >= glasses.ticketsRequired) {
                        glasses.claim(card)
                    } else {
                        println("Not enough tickets on Card #${card.id} to claim prize (${glasses.name}). Need ${glasses.ticketsRequired} tickets, but only has ${card.tickets}")
                    }
                } else {
                    println("No more ${glasses.name} left in the terminal.")
                }
            }
            else -> {
                println("Invalid prize name: $prize")
            }
        }
    }

    fun calculateDollarAmount(card: Card): Double {
        return card.credits.toDouble() / creditsToDollarsRatio
    }
}


