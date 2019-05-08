package df;

import org.apache.spark.sql.SparkSession;
import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Row;

public class Q03GetRevenuePerOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SparkSession spark = SparkSession
				.builder()
				.master(args[0])
				.appName("Get Revenue Per Order")
				.getOrCreate();
		
		// Read Order Items Data
		// Input base directory should be passed as argument
		
		// Process using Data Frame Operations
		// Aggregate using order_item_order_id as key
		
		// Write Output into JSON Files
		// Output directory should be passed as argument
		// Output should contain order_id and order_revenue
		

	}

}
