import java.util.*

// Personクラスは何とcomparableなのか示す為にComparable<Peroson>ですと示す
class Person (var name:String, var age:Int): Comparable<Person> {

    override fun compareTo(other: Person): Int {
        // 年齢から他のPersonの年齢をひく、結果＋であるものが最後にくるようにすると年齢順に
        // other.age - this.ageにすると年齢高いものが先にくる順番に
        return this.age - other.age
    }

}

fun main(args:Array<String>) {
    var listOfNames = ArrayList<Person>()

    listOfNames.add(Person("Mayuko", 22))
    listOfNames.add(Person("Hayashi", 44))
    listOfNames.add(Person("Testman", 9))
    println("start sorting")

    for (person in listOfNames) {
        println("Name: ${person.name}")
        println("Age: ${person.age}")
    }

    println("done sorting")

    Collections.sort(listOfNames)
    for (person in listOfNames) {
        println("Name: ${person.name}")
        println("Age: ${person.age}")
    }
}