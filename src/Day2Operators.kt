import java.util.*
import kotlin.math.round

fun main(){
    val scanner = Scanner(System.`in`)
    val actualMeal: Double = scanner.nextDouble()
    val tips: Int = scanner.nextInt()
    val tax: Int = scanner.nextInt()

    val tipPercent: Double = (tips*actualMeal)/100
    val taxPercent: Double = (tax*actualMeal)/100

    val ans = round(actualMeal+tipPercent+taxPercent)

    println(ans.toInt())
}