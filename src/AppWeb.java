public class AppWeb {
    private ILogIn logIn;

    public AppWeb(ILogIn logIn) {
        this.logIn = logIn;
    }

    public void authenticateUser(User user) {
        logIn.log(user);
    }

    // More application logic methods
}

// Se está violando el Single Responsibility Principle - dado que la clase AppWeb tiene más de una responsabilidad,
// ya que se encarga de la lógica de la aplicación web, la gestión de usuarios y la conexión a la base de datos.
// Se debería dividir esta clase en varias clases con responsabilidades únicas.

// Además, se está violando el Dependency Inversion Principle - dado que la clase AppWeb
// depende de clases concretas (LogIn, LogInAdmin, MySQL) en lugar de depender de abstracciones (interfaces o clases abstractas).
// Se debería usar interfaces para abstraer las dependencias y permitir una mayor flexibilidad y escalabilidad.
