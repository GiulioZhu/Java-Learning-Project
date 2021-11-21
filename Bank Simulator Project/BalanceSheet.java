import java.util.*;
import java.io.*;

public class BalanceSheet {
   private int accountID;   
   private double deposit;
   Map<Integer, Double> database = new HashMap<Integer, Double>();
   File file = new File("/Users/giuliozhu/Desktop/Java-Learning-Project/Bank Simulator Project/Balance Sheet");  
   BufferedWriter bf = null;
   BufferedReader br = null;

   public void addToBalance(int id, double initDeposit) {
      if (database.containsKey(id)) {
         double newBalance = database.get(id) + initDeposit;
         database.put(id, newBalance);
      } else {
         database.put(id, initDeposit);
      }
   }
   public double getBalance(int id) {
      if (database.containsKey(id)) {
         return database.get(id);
      } else {
         return 0;
      }
   }
   public void saveBalance() {  
      try {  
         // create new BufferedWriter for the output file
         bf = new BufferedWriter(new FileWriter(file));  
         // iterate map entries
         for (Map.Entry<Integer, Double> entry :
               database.entrySet()) {

            // put key and value separated by a colon
            bf.write(entry.getKey() + ":" + entry.getValue());  
            // new line
            bf.newLine();
         }  
         bf.flush();
      }
     catch (IOException e) {
         e.printStackTrace();
      }
      finally {  
         try {  
            // always close the writer
            bf.close();
         }
         catch (Exception e) {
         }
      }
   }

   public void retrieveBalance() {
      try {  
         // create BufferedReader object from the File
         br = new BufferedReader(new FileReader(file));
         
         String line = null;
         // read file line by line
         while ((line = br.readLine()) != null) {
            // split the line by :
            String[] parts = line.split(":");

            // first part is name, second is number
            String key = parts[0].trim();
            String value = parts[1].trim();
             // put name, number in HashMap if they are
             // not empty
             if (!key.equals("") && !key.equals(""))
                 database.put(Integer.parseInt(key), Double.parseDouble(value));
         }
      }
      catch (Exception e) {
         e.printStackTrace();
      }
      finally {
         // Always close the BufferedReader
         if (br != null) {
            try {
                  br.close();
            }
            catch (Exception e) {
            };
         }
      }
   }
}
/*
   //Creating the File object
   File file = new File("/Users/giuliozhu/Desktop/Java-Learning-Project/Bank Simulator Project/Balance.txt");
   if (file.createNewFile()) {

   }
   //Creating a Scanner object
   Scanner sc = new Scanner(file);
   //StringBuffer to store the contents
   StringBuffer sb = new StringBuffer();
   //Appending each line to the buffer
   while(sc.hasNext()) {
      sb.append(" "+sc.nextLine());
   }
*/