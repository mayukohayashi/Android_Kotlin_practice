fun main() {
    val message = "Welcome to Tokyo"
    //print(message[0])はWに

    println(message.toLowerCase())
    println(message.toUpperCase())
    println(message.trim())

    val listOfTokens:List<String> = message.trim().split(" ")
    for (token:String in listOfTokens){
        if (!token.contains("to") && !token.contains("is")){
            println("token: $token")
        }
    }



}