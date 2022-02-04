fun main() {
    val amount = 15000.00
    val isMusicFan = false
    val finishAmount = calcDiscount(amount, isMusicFan)
    println("Сумма с учетом скидок составила $finishAmount руб.")
}

fun calcDiscount(amount: Double, isMusicFan: Boolean): Double{
    val amountWithDisc: Double
    val finishAmount: Double
    when{
        (amount >= 1_001 && amount < 10_000) -> amountWithDisc = amount - 100.00
        (amount >= 10_001) -> amountWithDisc = amount * 0.95
        else -> amountWithDisc = amount
    }
    finishAmount = if(isMusicFan) amountWithDisc * 0.99 else amountWithDisc
    return finishAmount
}