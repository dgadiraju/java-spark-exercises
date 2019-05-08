package df;

import org.apache.spark.sql.SparkSession;
import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Row;

public class Q08SortNYSEDataByDateAndVolumeDesc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SparkSession spark = SparkSession
				.builder()
				.master(args[0])
				.appName("Sort NYSE Data By Date and Volume")
				.getOrCreate();
		
		// Read NYSE Data
		// Input base directory should be passed as argument
		
		// Process using Data Frame Operations
		// Sort Data in ascending order by Date and descending order by Volume
		
		// Write Output in CSV file format using gzip compression
		

	}

}
