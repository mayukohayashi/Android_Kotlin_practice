// TはTempleteだよ
class UserAdmins<T> (credit:T) {
    init {
        println(credit)
    }
}

fun <T> display(process: T){
    println(process)
}

fun main(args:Array<String>){
    var userAdminName = UserAdmins<String>("mayuko")
    var userAdminNumber = UserAdmins<Int>(212)

    display<Int>(22)
    display<String>("process uses")
}