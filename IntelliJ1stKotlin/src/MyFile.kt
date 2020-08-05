import java.io.FileReader
import java.io.FileWriter

fun main(args:Array<String>) {

    println("1: Read\n2: Write \n")
    val operation = readLine()!!.toInt()

    when(operation) {
        1 -> {
            ReadFromFile()
        }

        2 -> {
            ReadFromFile()
            println("Write something to Hello.txt")
            var str:String = readLine()!!.toString()
            WriteToFile(str)
        }
    }
}

fun WriteToFile(str:String){
   try {
       val findOut = FileWriter("Hello.txt", true) // append:trueで追加
       findOut.write(str + "\n")
       findOut.close()
       println("data is saved")

   } catch (ex:Exception) {
        println(ex.message)
   }
}


fun ReadFromFile() {
    try {
        val fileRead = FileReader("Hello.txt")
        var character:Int?
        do {
            character = fileRead.read()
            print(character.toChar()) // printlnにすると１文字１行に
        } while (character!=-1)

    } catch (ex:Exception) {
        println(ex.message)
    }

}