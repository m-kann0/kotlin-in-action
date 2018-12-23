package chap04

abstract class Animated {

    abstract fun animate()

    open fun stopAnimating() { // can override
    }

    fun animateTwice() { // can't override
    }
}

class MyAnimated : Animated() {

    override fun animate() {
    }

    override fun stopAnimating() {
    }

//    override fun animateTwice() {
//    }
}
