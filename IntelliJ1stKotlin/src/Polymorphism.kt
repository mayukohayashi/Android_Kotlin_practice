fun showInfo(cardID:Int){
    println("Card ID: $cardID")
}

fun showInfo(name:String){
    println("Name: $name")
}

fun main() {
    showInfo("Mayuko hayashi")
    showInfo(cardID = 2332)
}