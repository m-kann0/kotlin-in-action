package chap04

interface Context
interface AttributeSet

open class View {
    constructor(ctx: Context) {

    }

    constructor(ctx: Context, attr: AttributeSet) {

    }
}

class MyButton : View {
    constructor(ctx: Context) : this(ctx, object : AttributeSet {}) {

    }

    constructor(ctx: Context, attr: AttributeSet) : super(ctx, attr) {

    }
}
