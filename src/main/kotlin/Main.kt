import java.util.*

fun main(args: Array<String>) {
    val hundredDiscount = 100.0
    val fivePercentDiscount = 0.05
    var discount = 0.0

    val scanner = Scanner(System.`in`)
    println("Меломан покупает ежемесячно? \n" + "Ответье: да / нет")
    val answer = scanner.nextLine()

    //переведем значение в булиновую плоскость
    var isRegularCustomer = if (answer == "да") true else false

    println("Введите сумму покупки:")
    var sum = scanner.nextDouble()

    /* высчитаем скидку на основании того,
     является ли клиент постоянным покупателем
     */
    if (isRegularCustomer) {
        discount += (sum - calculateDiscount(sum)) * 0.01
        val finalSum = sum - discount
        println("Покупка -- $sum рублей. \n" + "После применения скидки: $finalSum")
    } else {
        val finalSum = sum - calculateDiscount(sum)
        println("Покупка -- $sum рублей. \n" + "После применения скидки: $finalSum")
    }
}

/*
высчитаем скидку без учета того, является ли покупатель
постоянным клиентом
 */
public fun calculateDiscount(sum: Double): Double {
    var discount = 0.0
    when {
        sum > 0 && sum <= 1000 -> discount = 0.0
        sum > 1000 && sum <= 10000 -> discount = 100.0
        sum > 10000 -> discount = sum * 0.05
    }
    return discount
}

