public class LogIn implements ILogIn {
    private DatabaseManager dbManager;

    public LogIn(DatabaseManager dbManager) {
        this.dbManager = dbManager;
    }

    public void log(User user) {
        System.out.println("Has access to the website");
        // Lógica de inicio de sesión
        dbManager.insertUserInDatabase(user);
    }
}

class DatabaseManager {
    public void insertUserInDatabase(User user) {
        // Insertar usuario en la base de datos
    }
}

// Se está violando el Single Responsibility Principle - dado que la clase LogIn tiene más de una responsabilidad,
// ya que se encarga de la lógica de inicio de sesión y también de la gestión de
// la base de datos a través de la clase DatabaseManager.
// Se debería dividir esta clase en varias clases con responsabilidades únicas.