fun main(){
    var num1 = ""
    var num2 = ""
    var sum = 0
    var count = 'Y'
    var accept = ""
    fun checknum(num: String): Int{
        try {
            return num!!.toInt()
        }
        catch(e: Exception){
            return 0
        }
    }
    fun sum(num1: String, num2: String): Int{
            return num1!!.toInt()+num2!!.toInt()
    }
    while (count=='Y'){
    print("Enter your first number: ")
    num1 = readLine()!!.toString()
    print("Enter your second number: ")
    num2 = readLine()!!.toString()
    if(checknum(num1)!=0&&checknum(num2)!=0) {
        println("$num1 + $num2 + "+sum(num1,num2))
        print("Would you like to add more numbers? (N/Y) ")
        accept = readLine().toString()
        when{ accept =="Y" -> count = 'Y'
            accept =="N" -> count = 'N'
            else -> {println("You've entered invalid value")
                break
                }}


    }
    else{
        println("Only numbers accepted!")
    }}
}