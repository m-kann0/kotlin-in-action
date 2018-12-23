package chap04

interface Clickable {
    fun click()
    fun showOff() = println("I'm clickable!")
}

interface Focusable {
    fun setFocus(b: Boolean) = println("I ${if (b) "got" else "lost"} focus.")
    fun showOff() = println("I'm focusable!")
}

class Button : Clickable, Focusable {
    override fun click() = println("I was clicked")

    override fun showOff() = super<Clickable>.showOff()
}

open class RichButton : Clickable {

    fun disable() {}

    open fun animate() {}

    override fun click() {}
}

class MyRichButton : RichButton() {
    // override fun disable() {} // can't override
    override fun animate() {}
    override fun click() {}
}

fun main(args: Array<String>) {
    val button = Button()
    button.click()
    button.setFocus(true)
    button.showOff()

    val animated = MyAnimated()
}
