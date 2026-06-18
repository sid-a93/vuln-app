class Application {

    private static String dbuser = "admin-user";
    private static String dbpassword = "admin-password";
    private static Database db = null;
    public static void main(String[] args) {
        System.out.println("Starting application...");
        db = new Database(dbuser, dbpassword);
        db.execute(System.console().readLine("Enter db query"));
    }


}