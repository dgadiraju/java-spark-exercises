package df;

import org.apache.spark.sql.SparkSession;
import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Row;

public class Q04GetProductRevenueForAGivenDay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SparkSession spark = SparkSession
				.builder()
				.master(args[0])
				.appName("Get Product Revenue for a given day")
				.getOrCreate();
		
		// Read Orders, Order Items and Products Data
		
		// Process using Data Frame Operations
		
		// Write Output into Parquet file format with out compression
		// Output should contain Product Name and Revenue in descending order by revenue
		

	}

}
