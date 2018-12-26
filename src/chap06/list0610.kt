package chap06

class MyService {
    fun performAction(): String = "foo"
}

class MyTest {

    private lateinit var myService: MyService

    // @Before
    fun setUp() {
        myService = MyService()
    }

    // @Test
    fun testAction() {
        myService.performAction()
    }
}
