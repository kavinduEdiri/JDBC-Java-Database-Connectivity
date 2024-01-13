import java.sql.SQLException;
import java.util.Date;

public class AppInitilizer {

    public static void main(String[] args) {
        CrudManager crudManager = new CrudManager();
        Account account = new Account("A-2","Jagath",50000);

        try{
            System.out.println(
                    crudManager.saveData(account)
            );
        }catch (SQLException | ClassNotFoundException e){
            e.printStackTrace();
        }



    }
}
