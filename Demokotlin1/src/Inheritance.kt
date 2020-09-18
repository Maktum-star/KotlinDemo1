package Kotlinsamples.Inhritance

open class Person(var name:String) {
    open fun talk()
    {
        println("Hi , I am $name")
    }
}

class manager(name:String, var subordinates:List<Person>) :Person(name)
{
    override fun talk() {
        println("Hi my name is $name and I have ${subordinates.size} subordinate")
    }
}
fun main (args: Array<String>)
{
    var maktum = Person("Maktum")
    maktum.talk()
    var boss = manager("Pitchu", listOf(maktum))
    boss.talk()
}