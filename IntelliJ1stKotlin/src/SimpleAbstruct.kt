abstract class CreditCard() {
    fun CreditID():String {
        return "1232333232"
    }
    abstract  fun newCredit()
}

class UserInfo(): CreditCard(){

    fun getInfo():String {
        return CreditID()
    }

    override fun newCredit() {
        println("new card created")
    }
}

fun main(args:Array<String>) {
//    var credit = CreditCard()
//    println(credit.CreditID())
    var user = UserInfo()
    println(user.getInfo())
}