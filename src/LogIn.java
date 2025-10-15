public class LogIn {
    public void log (User user) {
        System.out.println("Has access to the website");
        insertUserInDatabase(user);
        // Logic
    }
    public void insertUserInDatabase(User user){
        // Insert user in database
    }
}

//incumplimiento de LSP debido a que al heredarlo deberia su hijo poder reemplazarlo, no puede adherirse su parte 
//a la otra
// pues no pude ser reemplazada sin sufrir cambios
//ESTA MAL QUE SE ACCEDA AL INSERATAR USUARIO EN DATA SOLO EN LOGIN, DEBERIA HABER CLASE PERSONALIZADA PARA ESO