package chap04.list0409

import java.io.Serializable

interface State: Serializable

interface View {

    fun getCurrentState(): State

    fun restoreState(state: State)
}

class Button : View {

    override fun getCurrentState() = ButtonState()

    override fun restoreState(state: State) {
    }

    class ButtonState : State
}
