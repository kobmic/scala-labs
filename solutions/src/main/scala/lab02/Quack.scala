package lab02

trait Quack {
    def quack() = {
        "Quack"
    }
}

trait MuteQuack {
    def quack() = {
        "<< Silence >>"
    }
}

trait Squeak {
    def quack() = {
        "Squeak";
    }
}
