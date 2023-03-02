class Terminal {
    private val prizes = mutableListOf<PrizeCategory>(
        PrizeCategory("Candy", 10, 10),
        PrizeCategory("Hat", 20, 5),
        PrizeCategory("Glasses", 30, 3)
    )

    fun addCredits(card: Card, amount: Int) {
        card.addCredits(amount)
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

    fun requestPrize(prizeName: String, card: Card) {
        val prize = prizes.find { it.name == prizeName }
        if (prize == null) {
            println("Unknown prize: $prizeName")
            return
        }

        if (prize.count == 0) {
            println("Sorry, the $prizeName is out of stock.")
        }
    }}


