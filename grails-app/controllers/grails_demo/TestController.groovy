package grails_demo

class TestController {

    def test() {

        println ("This is test")
forward(controller: 'user', action: 'test')
    }
}
