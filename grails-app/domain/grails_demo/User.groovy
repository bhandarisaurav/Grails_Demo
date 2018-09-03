package grails_demo

class User {

    String name;
    String address;
    String email;
    String password;

    static constraints = {
        name(nullable: false, minSize: 4)
        password(nullable: false, minSize: 4)
        email(nullable: false, email: true)
    }
}
