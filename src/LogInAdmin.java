public class LogInAdmin extends LogIn {
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
    public void insertUserInDatabase(User user){
        // Insert user in database
    }
}

