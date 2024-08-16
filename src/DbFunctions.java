import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DbFunctions {
    public Connection connect_to_db(String dbName, String user, String password) {
        Connection conn = null;
        try {
            String urlDb = "jdbc:postgresql://localhost:5432/" + dbName;
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection(urlDb, user, password);
        } catch (Exception e) {
        }
        return conn;
    }

    public void addContact(Connection conn, String table_name, String name, String phoneNumber) {
        Statement statement;
        try {
            if(phoneNumber.length() == 10){
                String query = "INSERT INTO " + table_name +"(contact_name,contact_number) VALUES ('"+name.substring(0, 1).toUpperCase() + name.substring(1)+"','"+phoneNumber+"');";
                statement = conn.createStatement();
                statement.executeQuery(query);
            }else {
                System.out.println("Invalid phone number.");
            }

        } catch (Exception e) {
        }
    }

    public void listItems(Connection conn, String table_name){
        Statement statement;
        ResultSet resultSet= null;
        try {
            String query = "SELECT * FROM "+table_name;
            statement = conn.createStatement();
            resultSet = statement.executeQuery(query);
            while (resultSet.next()){
                String contactName = resultSet.getString("contact_name");
                String contactNumber= resultSet.getString("contact_number");
                System.out.println("Name: " + contactName + "\n" + "Phone number: " + contactNumber + "\n" + "-------");
            }
        }catch (Exception e){

        }

    }

    public void removeItem(Connection conn, String table_name, String toDelete){
        Statement statement;
        try {
            String query = String.format("DELETE FROM %s WHERE contact_name ='%s'",table_name,toDelete);
            statement = conn.createStatement();
            statement.executeQuery(query);
        }catch (Exception e){
        }
    }
}
