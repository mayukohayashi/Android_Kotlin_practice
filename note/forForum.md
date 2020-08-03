### Datatype

```java
fun main(){
    val str:String
    str = "ねむい zzzzzzzz"
    println(str)
}
```

ことりんはかしこいので、わざわざ宣言しなくてもいいよ。

```java
fun main(){
    val str = "ねむい zzzzzzzz"
    println(str)
}
```

```java
fun main(){
    var str:String
    str = "Welcome to Kotlin"

    val name:String = "Mayuko"
    val age:Int = 30
    val GPA:Double = 3.3

    println("Name: $name")
    println("Age: $age")
    println("GPA: $GPA")

    var count = 1
    println("Count: $count")
    count = 19
    println("Count: $count")

    var department:String?
    department = null
    department = "Software department"
    print("Department ${department!!}")
}
```

### Input

```java
fun main(){

    val name = "Mayuko"
    val age = 30
    val GPA = 3.3

    println("Name: $name")
    println("Age: $age")
    println("GPA: $GPA")
}
```

```java
fun main(){

    val name:String = readLine()!!.toString()
    val age = 30
    val GPA = 3.3

    println("Name: $name")
    println("Age: $age")
    println("GPA: $GPA")
}
```

`val name:String = readLine()!!.toString()`
ここで、聞いてきてくれる。
``val name:String`は、Stringですよ`readline()!!`何ですか？`.toString()`じゃあそれを String 型にしますねー。

```java
fun main(){
    println("Enter Name:")
    val name:String = readLine()!!.toString()
    println("Enter Age:")
    val age:Int = readLine()!!.toInt()
    println("Enter GPA:")
    val gpa:Double = readLine()!!.toDouble()

    println("Name: $name")
    println("Age: $age")
    println("GPA: $gpa")
}
```
