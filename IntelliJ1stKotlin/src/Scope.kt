
/*
 fun showInfo(name:String){
 }
他のクラスで同じ名前のファンクションが存在するので使えない
*/

/*
fun main() {

    showInfo("mayuko")
    // もってこれる
}
*/

var name:String?=null
//Global

fun showUserInfo() {
    name = "Welcome $name"
    println(" $name")
}

fun main() {
    name = "Mayuko"
    println(" $name")
    showUserInfo()
    println(" $name")
}