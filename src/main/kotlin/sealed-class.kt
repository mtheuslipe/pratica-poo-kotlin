sealed class Mammal ( val name: String)// criando a sealed class

//fazendo a relação de herança com a sealed class no mesmo pacote e enviando outros parâmetros
class Cat(catName: String): Mammal (catName)
class Human(humanName: String, val job: String): Mammal (humanName)

//função que faz faz a verificação de qual o tipo específico de dado armazenado, uma forma de plimorfismo
fun greetAnimal(mammal: Mammal){
    val greeting: String = when(mammal){
        is Cat -> "Hello, ${mammal.name}"
        is Human -> "Hi ${mammal.name}, good job as ${mammal.job}"
    }
    println(greeting)
}
fun main(){
    //chamando a função para verificação
    greetAnimal(Cat("Lucy"))
    greetAnimal(Human("Matheus", "developer"))
}