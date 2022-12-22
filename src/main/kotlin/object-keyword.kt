//função para fazer um cálculo de aluguel
fun rentPrice(standardDays:Int, festivyDays:Int, specialDays:Int){

    //objeto em única instância  para fazer as contas necessárias e somando em uma única variável
    var rentCalc = object{
        var standard = 30 * standardDays
        var festivy = 20 * festivyDays
        var special = 50 * specialDays
        var total = standard + festivy + special
    }
    // retornando o valor total do aluguel
    print("rent price: R$ ${rentCalc.total}")
}
fun main(){
    //chamando a função
    rentPrice(10,32,56)
}