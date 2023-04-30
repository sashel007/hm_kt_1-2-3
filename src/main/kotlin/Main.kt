import java.util.*

fun main(args: Array<String>) {
    val hundredDiscount = 100.0
    val fivePercentDiscount = 0.05

    val scanner = Scanner(System.`in`)
    println("Меломан покупает ежемесячно? \n" + "Ответье: да / нет")
    val answer = scanner.toString()
    var isRegularCustomer = if (answer == "да") true else false
    println("Введите сумму покупки:")
    var sum = scanner

    fun calculateDiscount(sum: Double, isRegularCustomer: Boolean): Double {
        var discount = 0.0
        when {
            sum > 0 && sum <= 1000 -> discount = 0.0
            sum > 1000 && sum <= 10000 -> discount = 100.0
            sum > 10000 -> discount = sum * 0.05
        }
        if (isRegularCustomer) {
            discount += discount * 0.01
            println("Покупка -- $sum рублей. \n" + "После применения 5% скидки")
        }
        return discount
    }

}

