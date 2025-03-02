fun main() {
    println("Введите числа и операцию (например, 5.2 3.1 +):")
    val input = readLine()!!.split(" ")
    val num1 = input[0].toDouble()
    val num2 = input[1].toDouble()
    val operation = input[2]

    var result: Double

    when (operation) {
        "+" -> result = num1 + num2
        "-" -> result = num1 - num2
        "*" -> result = num1 * num2
        "/" -> result = num1 / num2
        else -> {
            println("Неверная операция!")
            return
        }
    }

    println("Результат: $result")
}
