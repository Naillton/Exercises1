package CalcForms

class CalcForms(
    private var side: Double,
    private var radius: Double,
    private var pi: Double = 3.14,
    ): FormsMethods {
    override fun circle(): Double {
        return (2 * pi) * radius
    }

    override fun triangle(): Double {
        return 3 * side
    }

    fun getPi(): Double {
        return this.pi
    }
}