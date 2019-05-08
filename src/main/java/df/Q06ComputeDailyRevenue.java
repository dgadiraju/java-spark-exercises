package df;

import org.apache.spark.sql.SparkSession;
import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Row;

public class Q06ComputeDailyRevenue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SparkSession spark = SparkSession
				.builder()
				.master(args[0])
				.appName("Read and Write APIs")
				.getOrCreate();
		
		// Read Orders and Order Items Data
		// Input base directory should be passed as argument
		
		// Process using Data Frame Operations
		// Filter for all complete or closed orders
		// Aggregate using order_date as key
		
		// Write Output in avro file format with out compression
		// Output directory should be passed as argument
		// Output should contain order_date and revenue
		// Data should be sorted by order_date
		

	}

}
