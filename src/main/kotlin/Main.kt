import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    println("Digite o primeiro numero: ")
    val n1: Int = sc.nextInt()
    println("digite o segundo numero: ")
    val n2: Int = sc.nextInt()
    val op = Operation(n1, n2)
    println(op.sum())
    println(op.sub())
    println(op.mult())
    println(op.division())
    println(op.rest())
}