package df;

import org.apache.spark.sql.SparkSession;
import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Row;

public class Q07GetTopNMonthlyCustomersByRevenue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SparkSession spark = SparkSession
				.builder()
				.master(args[0])
				.appName("Read and Write APIs")
				.getOrCreate();
		
		// Read Orders, Order Items and Customers Data
		// Input base directory should be passed as argument
		
		// Process using Data Frame Operations
		// Filter for all complete or closed orders
		// Aggregate using order month derived from order_date and customer_id as key
		// Get ranking and filter for top N customers
		
		// Write Output in CSV file format with out compression
		// Output directory should be passed as argument
		// Output should contain order_month, customer_id, customer_fname, customer_lname and revenue
		// Data should be sorted in ascending order by order_month and descending order by revenue
		

	}

}
