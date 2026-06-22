class Application {
    
    private static String dbuser = System.getenv("DB_USER");
    private static String dbpassword = System.getenv("DB_PASSWORD");
    private static Database db = null;
    public static void main(String[] args) {
        System.out.println("Starting application...");
        db = new Database(dbuser, dbpassword);
        db.execute(System.console().readLine("Enter db query"));
    }

}
