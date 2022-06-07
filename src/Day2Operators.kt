import java.util.*
import kotlin.math.round

fun main(){
    val meal_cost = readLine()!!.trim().toDouble()

    val tip_percent = readLine()!!.trim().toInt()

    val tax_percent = readLine()!!.trim().toInt()

    solve(meal_cost, tip_percent, tax_percent)
}

fun solve(mealCost: Double, tipPercent: Int, taxPercent: Int): Unit {
    val tips = (tipPercent / 100.00) * mealCost
    val tax = (taxPercent/100.00) * mealCost
    val totalCost = mealCost +tips + tax
    val intTotalCost: Int = round(totalCost).toInt()
    println(intTotalCost)

}