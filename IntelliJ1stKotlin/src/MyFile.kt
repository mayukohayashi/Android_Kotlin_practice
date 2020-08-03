import java.io.FileReader
import java.io.FileWriter

fun main(args:Array<String>) {

    println("Write something to Hello.txt")
    var str:String = readLine()!!.toString()
    WriteToFile(str)
}

fun WriteToFile(str:String){
   try {
        var findOut = FileWriter("Hello.txt", true) // append:trueで追加
        findOut.write(str + "\n")
        findOut.close()
   } catch (ex:Exception) {
        println(ex.message)
   }
}


fun ReadFromFile() {
    try {
        var fileRead = FileReader("Hello.txt")
        var character:Int?
        do {
            character = fileRead.read()
        } while ()

    } catch (ex:Exception) {
        println(ex.message)
    }

}