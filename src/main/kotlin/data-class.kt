//declarando a data class
data class User(var name: String,var id : Int){
    //subescrevendo a função equals
    override fun equals(other: Any?): Boolean {
        return other is User && other.id == this.id
    }
}

fun main(){
    //chamando a classe
    val user: User = User("Matheus", 1)
    println(user)

    val secondUser: User = User("Matheus", 1)
    val thirdUser:User = User("Luiz", 2)

    //realizando a função equals
    println("user == secondUser = ${user == secondUser}")
    println("user == thirdUser = ${user == thirdUser}")

    println()

    //utilizando a função hashCode()
    println("${user.hashCode()}")
    println("${secondUser.hashCode()}")
    println("${thirdUser.hashCode()}")

    println()

    //usando a função copy()
    println("${user.copy()}")
    println("user === user.copy = ${user === user.copy()}")
    println(user.copy("Luiza"))
    println(user.copy(user.name, 5))
}