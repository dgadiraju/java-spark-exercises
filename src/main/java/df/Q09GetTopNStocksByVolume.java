package df;

import org.apache.spark.sql.SparkSession;
import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Row;

public class Q09GetTopNStocksByVolume {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SparkSession spark = SparkSession
				.builder()
				.master(args[0])
				.appName("Read and Write APIs")
				.getOrCreate();
		
		// Read NYSE Data
		// Input base directory should be passed as argument
		
		// Process using Data Frame Operations
		// Get top 5 stocks by volume
		
		// Write Output in CSV file format with out compression
		
	}

}
