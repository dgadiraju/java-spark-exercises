package df;

import org.apache.spark.sql.SparkSession;
import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Row;

public class Q05GetRevenueForFirstDayOfEveryMonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SparkSession spark = SparkSession
				.builder()
				.master(args[0])
				.appName("Read and Write APIs")
				.getOrCreate();
		// Read Orders as well as Order Items
		// Input base directory should be passed as argument
		
		// Process using Data Frame Operations
		// Filter for complete or closed orders as well as 1st of every month
		// Compute revenue for each filtered date.
		
		// Write Output into ORC file format with out compression
		// Output directory should be passed as argument
		// Output should contain Date and Revenue sorted by date
		

	}

}
