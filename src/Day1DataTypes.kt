import com.sun.jdi.IntegerValue
import java.util.*

fun main(){
    val scanner = Scanner(System.`in`)
    val number: Int = scanner.nextInt()
    val doubleNumber: Double = scanner.nextDouble()
    scanner.next()
    val line: String= scanner.nextLine()


    val doubleIntValue: Int = (number+doubleNumber).toInt()
    println(doubleIntValue)
    println(doubleNumber+doubleNumber)
    println("Hackerrank".plus(line))
}