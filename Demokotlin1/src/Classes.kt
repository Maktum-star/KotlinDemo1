class Customer                                  // 1

class Contact(val id: Int, var email: String)   // 2

fun main() {

    val customer = Customer()                   // 3 Creates instance of class Customer

    val contact = Contact(1, "mary@gmail.com")  // 4 Creates instance of class Contact

    println(contact.id)                         // 5
    contact.email = "jane@gmail.com"            // 6

    println(contact.email)

    val person = Person()
    person.name = "Maktum"
    person.age = 26
    println(person.name)

    val h = maktum("Maktumjamadar", 25)  // Example of primary constructor
    println("I am ${h.name1} and I am ${h.age1}")

    var h1 = maktummj("Maktum", 25)            //Data class reference
    println(h1)
    var h2 = maktummj("Maktum", 25)
    println(h1 == h2)
    var h3 = h1.copy()
    println(h1 == h3)
    val (name1, age1) = h1
    println("$name1, $age1")
}

class Person()
{
    var name:String = ""
    var age:Int = -1;
}

class maktum(val name1:String, var age1:Int)
{
    init{              //Initialization
        println("My name is $name1, I am $age1 years old")
    }
}

data class maktummj(val name1:String, var age1:Int)
{
    //equals/hashcode
    //toString()
    //destructuring
    //copy()
    override fun toString() : String {   ///Overriding toString
       return "My name is $name1 , I am $age1 years old"
    }
}

