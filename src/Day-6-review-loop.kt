fun main(){
    var testCase = readLine()!!.trim().toInt()
    outputData(testCase)
}

fun outputData(testCase: Int) {
    for (i in 1..testCase){
        var line: String = readLine()!!.trim()
        var evenIndex = ""
        var oddIndex = ""
        for (j in line.indices){
            if (j%2==0){
                evenIndex+= line[j].toString()
            }else{
                oddIndex += line[j].toString()
            }
        }
        println("$evenIndex $oddIndex")
    }
}
