class Outer {
    private val name:String? = null

    // ここにinnerと記述してやる
    class Nested {
        fun Show() {
            println("Nested here")
            println(name) // これだけではOuterからひっぱってこれないので…↑
        }
    }
}

fun main (args:Array<String>) {
    var outer = Outer()
    var nested = Outer.Nested()
    nested.Show()
}