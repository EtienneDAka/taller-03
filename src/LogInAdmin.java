public class LogInAdmin implements ILogIn {
    private boolean userIsAdmin;
    @Override
    public void log (User user) {
        this.userIsAdmin = verifyIfTheUserIsAdmin(user);
        if(!userIsAdmin){
            return;
        }
        System.out.println("Has access to the website in admin mode");
        // Logic
    }
    private boolean verifyIfTheUserIsAdmin(User user){
        // Do something
        return true;
    }
}
// Se está violando el Liskov Substitution Principle - dado que la clase hija LogInAdmin
// no puede sustituir completamente a la clase padre LogIn sin alterar el comportamiento esperado.
// Para solucionar esto, se podría cambiar la clase LogIn para que incluya un método
// que permita verificar si un usuario tiene privilegios de administrador, de modo que
// LogInAdmin no necesite implementar esta lógica por sí misma.
