//classe pai
open class Dog(){
    open fun sayHello(){
        println("au au au")
    }
}
//classe filha
class Yorkshire: Dog(){
    //subscrevendo função/propriedade da função pai
    override fun sayHello() {
        println("wif wif wif!")
    }
}
fun main(){
    //chamando classes e testando aplicabilidade da propriedade
    val dog: Dog = Yorkshire()
    dog.sayHello()
}