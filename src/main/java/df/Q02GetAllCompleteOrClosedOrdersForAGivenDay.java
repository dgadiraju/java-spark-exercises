package df;

import org.apache.spark.sql.SparkSession;
import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Row;

public class Q02GetAllCompleteOrClosedOrdersForAGivenDay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SparkSession spark = SparkSession
				.builder()
				.master(args[0])
				.appName("Get all Complete and Closed Orders for a given day")
				.getOrCreate();
		
		// Read Orders Data
		// Input base directory should be passed as argument
		
		// Process using Data Frame Operations
		// Filter for all complete or closed orders for a given day passed as argument
		
		// Write Output in pipe delimited format into text files
		// Output directory should be passed as argument
		// Output should contain all the fields from orders data set
		

	}

}
