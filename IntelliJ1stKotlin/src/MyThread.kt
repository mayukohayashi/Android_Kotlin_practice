
fun main(args:Array<String>){
    var thread1 = thread("thread1")
    thread1.start()

    var thread2 = thread("thread2")
    thread2.start()
    println("--- thread is running ---")
}

class thread():Thread(){
    var ThreadName:String = ""

    constructor(ThreadName:String):this(){
        this.ThreadName = ThreadName
        println("${this.ThreadName} is counting")
    }

    override  fun run() {
        // Write Thread

        var count = 0
        while (count < 10) {
            println("${this.ThreadName} - Count: $count")
            count++

            try {
                Thread.sleep(1000)
            } catch (ex:Exception) {
                println(ex.message)
            }
        }
    }
}