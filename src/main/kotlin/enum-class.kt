//declarando a enum class
enum class State(){
    IDLE, RUNNING, FINISHED
}
fun main(){
    // armazenando um state da enum class e retornando uma mensagem de acordo com o valor da variável state
    val state: State = State.FINISHED
    val message: String = when(state){
        State.IDLE -> "it's idle"
        State.RUNNING -> "it's running"
        State.FINISHED -> "it's finished"
    }
    println(message)
}