fun main(){

    val n: Int = readLine()!!.trim().toInt()

    if (n%2==0){
       if(n in 3..5){
           println("Not Weird")
       }else if (n in 7..20){
           println("Weird")
       }else if(n>20){
           println("Not Weird")
       }
    }else{
        println("Weird")
    }
}