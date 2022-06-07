fun main(){
    val n = readLine()!!.trim().toInt()
    calculateNumbersForLoop(n)
}

fun calculateNumbersForLoop(n: Int) {
    for(i in 1..10){
        println(n.toString() +" x "+ i +" = "+ n*i)
    }
}
