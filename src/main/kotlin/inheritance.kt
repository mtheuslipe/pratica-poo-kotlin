//classe pai para praticar herança simples
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

//prática de herança com construtor parametrizado e com Herança enviando parâmetro para superclasse
open class Car(nome: String){
    val carName: String = nome
    open fun sayCarName(){
        println("the car is a $carName")
    }
}
class Volks : Car("Gol")

//Herança enviando parâmetro para superclasse
class Nissan(name: String): Car(name)


fun main(){
    //chamando classes e testando aplicabilidade da propriedade e vendo como funciona herança simples
    val dog: Dog = Yorkshire()
    dog.sayHello()

    //chamando as classes e trabalhando com herança com construtor parametrizado e também plimorfismo
    val car: Car = Volks()
    car.sayCarName()

    //chamando as classes e implementando o parâmetro aqui na classe filha para a superclasse
    val carNissan: Car = Nissan("Versa")
    carNissan.sayCarName()
}