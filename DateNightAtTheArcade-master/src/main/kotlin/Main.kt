fun main(args: Array<String>) {
    val card1 = Card()
    val card2 = Card()
    val game1 = Game(5)
    val game2 = Game(7)
    val terminal1 = Terminal()
    val terminal2 = Terminal()

    terminal1.addCredits(card1, 20)
    terminal1.addCredits(card2, 20)

    println("\n\n>>> Card #1 is used to play Game #1 5 times...")
    for (i in 0..4) {
        game1.play(card1)
    }

    println("\n\n>>> Card #2 is used to play Game #2 5 times...")
    for (i in 0..4) {
        game2.play(card2)
    }

    println("\n\n>>> Credits & Tickets will be transferred from Card #1 to Card #2...")
    terminal1.transferCredits(card1, card2)
    terminal1.transferTickets(card1, card2)

    println("\n\n>>> Request prize Candy with Card #2...")
    terminal1.requestPrize("Candy", card2)

    println("\n\n>>> Card #1 is used to play Game #1 one more time...")
    game1.play(card1)

    println("\n\n>>> Request different prizes with Card #1 and Card #2...")
    terminal1.requestPrize("Candy", card1)
    terminal1.requestPrize("Hat", card2)
    terminal1.requestPrize("Candy", card2)
    terminal1.requestPrize("Glasses", card2)
    terminal1.requestPrize("Candy", card2)
    terminal1.requestPrize("Candy", card2)
}