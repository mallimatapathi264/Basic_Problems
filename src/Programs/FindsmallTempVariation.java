package Programs;

import java.util.ArrayList;

class Day{
	int max;
	int min;
	Day(int max, int min)
	{
		this.max=max;
		this.min=min;
	}
	int getVariation()
	{
		return max-min;
	}
}
public class FindsmallTempVariation {
public static void main(String[] args) {
	ArrayList<Day> days= new ArrayList<>();
	days.add(new Day(40, 20));
    days.add(new Day(35, 25));
    days.add(new Day(30, 15));
    days.add(new Day(38, 28));
    days.add(new Day(42, 32));
    
    Day small= days.get(0);
    for(Day d:days)
    {
    	if(d.getVariation()<small.getVariation())
    	{
    		small=d;
    	}
    	
    }
    System.out.println(small.getVariation()+"th day is the smallest temperature");
}
	
}	
/*
 package Programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Day {
    int max;
    int min;

    Day(int max, int min) {
        this.max = max;
        this.min = min;
    }

    int getVariation() {
        return max - min;
    }
}

public class FindsmallTempVariation {
    public static void main(String[] args) {
        // Create a list of Day objects
        ArrayList<Day> days = new ArrayList<>();
        
        // Populate the list with sample data
        days.add(new Day(40, 20));
        days.add(new Day(35, 25));
        days.add(new Day(30, 15));
        days.add(new Day(38, 28));
        days.add(new Day(42, 32));
        // Add more Day objects as needed...

        // Find the day with the smallest temperature variation
        Day smallestVariationDay = Collections.min(days, Comparator.comparingInt(Day::getVariation));
        
        // Print the smallest variation
        System.out.println("Smallest temperature variation: " + smallestVariationDay.getVariation() + "°C");
        System.out.println("Max temperature: " + smallestVariationDay.max + "°C");
        System.out.println("Min temperature: " + smallestVariationDay.min + "°C");
    }
}
*/



/*
package Programs;

import java.util.ArrayList;

class Day {
    int max;
    int min;

    Day(int max, int min) {
        this.max = max;
        this.min = min;
    }

    int getVariation() {
        return max - min;
    }

    @Override
    public String toString() {
        return "Day{" + "max=" + max + ", min=" + min + ", variation=" + getVariation() + "}";
    }
}*/

/*
public class FindsmallTempVariation {
    public static void main(String[] args) {
        ArrayList<Day> days = new ArrayList<>();
        days.add(new Day(40, 20));
        days.add(new Day(35, 25));
        days.add(new Day(30, 15));
        days.add(new Day(38, 28));
        days.add(new Day(42, 32));
        
        Day smallestVariationDay = days.get(0);
        for (Day d : days) {
            if (d.getVariation() < smallestVariationDay.getVariation()) {
                smallestVariationDay = d;
            }
        }
        
        System.out.println("Day with the smallest temperature variation: " + smallestVariationDay);
    }
}
*/