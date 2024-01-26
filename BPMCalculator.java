package HeartBeat;

import org.testng.annotations.Test;
import java.util.Scanner;
import java.util.Arrays;
import java.util.List;

public class BPMCalculator {

	
	
	
	    public static void main(String[] args) {
	        // Assuming BPM data is stored in a list
	        List<Integer> bpmData = Arrays.asList(60, 119);

	        // Calculate minimum BPM
	        int minBPM = bpmData.stream().mapToInt(Integer::intValue).min().orElse(0);

	        // Calculate maximum BPM
	        int maxBPM = bpmData.stream().mapToInt(Integer::intValue).max().orElse(0);

	        // Calculate median BPM
	        double medianBPM;
	        int size = bpmData.size();
	        if (size % 1 == 0) {
	            medianBPM = (bpmData.get(size / 2 - 1) + bpmData.get(size / 2)) / 2.0;
	        } else {
	            medianBPM = bpmData.get(size / 2);
	        }

	       
	        
	        String latestTimestamp = "2024-01-26 12:00:00";

	        // Print the results
	        System.out.println("Minimum BPM: " + minBPM);
	        System.out.println("Maximum BPM: " + maxBPM);
	        System.out.println("Median BPM: " + medianBPM);
	        System.out.println("Latest Data Timestamp: " + latestTimestamp);
	    }
	}