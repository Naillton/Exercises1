import CalcForms.CalcForms
import java.util.*

fun main() {
    // implementando calculos do exercicio 1
    /*val sc = Scanner(System.`in`)
    println("Digite o primeiro numero: ")
    val n1: Int = sc.nextInt()
    println("digite o segundo numero: ")
    val n2: Int = sc.nextInt()
    val op = Operation(n1, n2)
    sc.close()
    println(op.sum())
    println(op.sub())
    println(op.mult())
    println(op.division())
    println(op.rest())*/
    val calc = CalcForms(12.4,4.5)
    val resultCirc: Double = calc.circle()
    val resultTriang: Double = calc.triangle()
    println("O perimetro do circulo e: $resultCirc")
    println("O perimetro do triangulo e: $resultTriang")
    println(calc.getPi())
}