import java.sql.SQLException;
import java.util.Date;

public class AppInitializer {
    public static void main(String[] args) {
        CrudManager crudManager = new CrudManager();
        Account account = new Account("A-2","Jagath",50000);
        Payment payment = new Payment(
                "P-2",new Date(),4500);
        try{
            System.out.println(
                    crudManager.saveData(account,payment)
            );
        }catch (SQLException | ClassNotFoundException e){
            e.printStackTrace();
        }

    }
}
