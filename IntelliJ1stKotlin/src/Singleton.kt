class Singleton {

    var name:String?=null

    private constructor() {
        println("Instance is created")
    }

    companion object {
        val instance:Singleton by lazy {
            Singleton()
        }
    }
}

fun main(args:Array<String>) {
    var singleton1 = Singleton.instance
    singleton1.name = "hayashi"
    println(singleton1.name)

    var singleton2 = Singleton.instance
    println(singleton2.name)
}
