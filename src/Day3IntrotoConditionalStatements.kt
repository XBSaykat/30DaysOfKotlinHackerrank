fun main(){
    val n: Int = readLine()!!.trim().toInt()

    calculateWeirdNumber(n)
}

fun calculateWeirdNumber(n: Int) {
    if (n%2==0){
        when {
            n in 3..5 -> {
                println("Not Weird")
            }
            n in 7..20 -> {
                println("Weird")
            }
            n>20 -> {
                println("Not Weird")
            }
        }
    }else{
        println("Weird")
    }
}
