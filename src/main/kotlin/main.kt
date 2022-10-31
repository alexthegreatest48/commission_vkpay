fun main() {
    val amount = 1000
    val percent = 0.75
    val min_com = 35

    val commission =  if (min_com > amount * percent) min_com else (amount - amount * percent)
    println(commission)
}