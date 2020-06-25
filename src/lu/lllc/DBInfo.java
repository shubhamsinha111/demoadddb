package lu.lllc;

public class DBInfo {
	
	static String password;
	static String user;
	static String mySQLdbURL;
	static String driver;
	static String rootpassword;
	public static void main(String []args)
	{
	String host = "mysql"; // In most cases you will use
													// localhost
	//static String DBname = "lllc";
	int port = 3306; // This is for MySQL
	

	//static String user = "user";

	user = System.getProperty("MYSQL_USER") ;
    System.out.println("Username using system property: "  + user);


	password = System.getProperty("MYSQL_PASSWORD") ;
	
   rootpassword = System.getProperty("MYSQL_ROOT_PASSWORD") ;
	
	String DBname = System.getProperty("MYSQL_DATABASE") ;
	
	 mySQLdbURL = "jdbc:mysql://" + host + ":" + port + "/"
			+ DBname;
	
	  driver = "com.mysql.jdbc.Driver";
	}

	public DBInfo() {

	}

	static String getDBURL() {
		return mySQLdbURL;
	}

	public static String getUser() {
		return user;
	}

	public static String getPassword() {
		return password;
	}

	public static String getDriver() {
		return driver;
	}

}
