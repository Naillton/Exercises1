class Operation(private var n1: Int, private var n2: Int): OperatorsMetods {
    // implementando funcoes da minha interface, lembrar sempre de por override
    // quando elas tiverem que ser implementadas na classe
    override fun sum(): Int {
        return n1 + n2
    }

    override fun sub(): Int {
        return n1 - n2
    }

    override fun mult(): Int {
        return n1 * n2
    }

    override fun division(): Int {
        return n1 / n2
    }

    override fun rest(): Int {
        return n1 % n2
    }

}