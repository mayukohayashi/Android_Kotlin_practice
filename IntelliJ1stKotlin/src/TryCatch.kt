fun main (args:Array<String>) {

    // 0とかいれると、フォーエバー系になってしまってエラー出る、Try-Catchで解決だ！
    try {
        println("Please enter number")

        var number:Int = readLine()!!.toInt()
        var Div = 100/number
        println("Div: $Div")

    } catch (ex:Exception) {
        // エラーメッセージだすよ
        println(ex.message)
    }

    println("APP FIN")
}