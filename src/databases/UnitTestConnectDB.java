package databases;

import org.testng.Assert;

public class UnitTestConnectDB {
    public static void main(String[] args) throws Exception {
        try{
            ConnectToMongoDB connectToMongoDB = new ConnectToMongoDB();
            Assert.assertEquals(connectToMongoDB.readUserProfileFromMongoDB(),"user");
            System.out.println("MongoDB Connection passed");
        }catch (AssertionError as){
            as.printStackTrace();
            System.out.println("MongoDB Connection Failed");
        }
        try{ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
        Assert.assertEquals(connectToSqlDB.readDataBase("",""),
                connectToSqlDB.readDataBase("",""));
        System.out.println("Connection Test Passed");}
        catch (AssertionError as){
            System.out.println("Connection Test failed");
        }
    }
}
