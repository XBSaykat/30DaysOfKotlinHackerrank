fun main() {
    val n = readLine()!!.trim().toInt()
    val arr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()
    arr.reverse()

    arr.forEach { index ->print("$index ") }
}