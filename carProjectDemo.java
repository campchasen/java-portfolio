package carProject;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Comparator;

public class carProjectDemo {
	
	private static Car[] C;
	private static String[] stringTemp;
	private static String[] stringTempMaker;
	private static double[] doubleTempPrice;

	public static void main(String[] args) 
	{
		
		//At least two objects for each class. 
		//When the demo is executed, a summary of all the individual cars, as well as the general type of cars (sedan, suv, sports, etc.) will display. 
		Sedan SedMakeModel1 = new Sedan("Chevy", "Sedan");
		Sedan SedMakeModel2 = new Sedan("Ford", "Sedan");
			Malibu redMalibu = new Malibu("Chevy", "Sedan", "Malibu",  69900.0, 1300, "red" );
			Malibu blueMalibu = new Malibu("Chevy", "Sedan", "Malibu",  59900.0, 556, "blue" );
			Fiesta greenFiesta = new Fiesta("Ford", "Sedan", "Fiesta", 43000, 4566, "green" );
			Fiesta greyFiesta = new Fiesta("Ford", "Sedan", "Fiesta", 33000, 3454, "grey" );
		
		
		SUV SUVMakeModel1 = new SUV("Chevy", "SUV");
		SUV SUVMakeModel2 = new SUV("Ford", "SUV");
			Explorer whiteExplorer = new Explorer("Ford", "SUV", "Explorer", 70000, 34, "white");
			Explorer blueExplorer = new Explorer("Ford", "SUV", "Explorer", 70000, 345, "blue");
			Tahoe goldTahoe = new Tahoe("Chevy", "SUV", "Tahoe", 50000, 234, "gold");
			Tahoe blackTahoe = new Tahoe("Chevy", "SUV", "Tahoe", 49000, 232, "black");
			
		SportsCar SCMakeModel = new SportsCar("Chevy", "Sports Car");
		SportsCar SCMakeMode2 = new SportsCar("Ford", "Sports Car");
			Challenger blackChall = new Challenger("Chevy", "Sports Car", "Challenger", 80000, 909, "black");
			Challenger whiteChall = new Challenger("Chevy", "Sports Car", "Challenger", 80000, 989, "white");
			Mustang limeGreenMust = new Mustang("Ford", "Sports Car", "Mustang", 79000, 208, "lime green");
			Mustang purpleMust = new Mustang("Ford", "Sports Car", "Mustang", 79000, 233, "purple");
			
			
		//1D array
		C = new Car[12];
	    Car[] C = {redMalibu, blueMalibu, greenFiesta, greyFiesta, whiteExplorer, blueExplorer, goldTahoe, blackTahoe, blackChall, whiteChall, limeGreenMust, purpleMust};
	    
	    
	    //invoke specific methods
	    //invoke the polymorphisms of all report and unique methods for each child class.d
	    SedMakeModel1.sedanMethod();
	    SedMakeModel2.Report("", "Sedan", "", 0, 0, "");
	    redMalibu.MalibuMethod();
	    blueMalibu.Report();
	    greenFiesta.FiestaMethod();
	    greyFiesta.Report(); 
	    SUVMakeModel1.SUVMethod();
	    SUVMakeModel2.Report("", "SUV", "", 0, 0, "");
	    whiteExplorer.ExplorerMethod();
	    blueExplorer.Report();
	    goldTahoe.TahoeMethod();
	    blackTahoe.Report();
	    SCMakeModel.sportsCarMethod();
	    SCMakeMode2.Report("", "Sports Car", "", 0, 0, "");
	    blackChall.ChallengerMethod();
	    whiteChall.Report();
	    limeGreenMust.MustangMethod();
	    purpleMust.Report();
	    
	    
	    //print all cars info
	       System.out.println();
	       for( int index = 0; index < 12; index++)
	       {
	    	  System.out.println(C[index]);  
	       }
	       
	       //Henceforth, polymorphisms of more general methods(.toString(), getMake(), getPrice(), etc.) will be used in the prompt menu and sorting algorithms. 
	       redMalibu.getMake();
	       Scanner scan = new Scanner(System.in);
	       System.out.println();
			System.out.println("Enter the name and color of the car you want to search, Ex) redMalibu, blueExplorer..case sensitive no space, as in, colorModel: ");
			String car = scan.next();
			
			
				stringTemp = new String[12];//temporarily stores each type of car in a string array for sorting
				String[] stringTemp= {"redMalibu", "blueMalibu", "greenFiesta", "greyFiesta", "whiteExplorer", "blueExplorer", "goldTahoe", "blackTahoe", "blackChall", "whiteChall", "limeGreenMust", "purpleMust"};
//****************linear search to output info on car****************************************************************************************************************************888
				int n = stringTemp.length; 
				for(int i = 0; i < n; i++) 
				{ 
					if(stringTemp[i].equals(car)) {
						System.out.println(C[i]);
					
					}
					
				}
		
//********************************Sort by maker or price menu and algorithms***********************************************************************************************************************************8		    
				
				
				
				stringTempMaker = new String[12];//temporarily stores String cars makers in temp array for sorting
				String[] stringTempMaker= {redMalibu.getMake(), blueMalibu.getMake(), greenFiesta.getMake(), greyFiesta.getMake(), whiteExplorer.getMake(), blueExplorer.getMake(), goldTahoe.getMake(), blackTahoe.getMake(), blackChall.getMake(), whiteChall.getMake(), limeGreenMust.getMake(), purpleMust.getMake()};
				//System.out.println(stringTempMaker[6]); test to make sure it works
				doubleTempPrice = new double[12];
				double[] doubleTempPrice = {69900.0, 59900.0, 43000, 33000, 70000, 70000, 50000, 49000, 80000, 80000, 79000, 79000}; 
				
				// a user prompt to sort all the cars by maker or price
				Scanner scan2 = new Scanner(System.in);
				String option;
				do
				{
					System.out.println("Select: ");
					System.out.println("1. sort by maker");
					System.out.println("2. sort by price");
					option = scan2.next();
					switch ( option.charAt(0)   )
					{
						// a selection sort algorithm for string valued array
					    case '1':
					    	for( int index =0; index < stringTempMaker.length -1; index++  )
							{
								// assume the Index of min value is equal to outer index
								int assume_min_index = index;

								// to find the index of the smallest value
								for( int smallest_index = index +1; smallest_index < stringTempMaker.length; smallest_index++ )
									/*Read as: for values starting at 0 to 5 in increments of smallest+1*/
								{
									if ( stringTempMaker[ smallest_index ].compareTo(stringTempMaker[assume_min_index]) < 0)
										assume_min_index = smallest_index;

								}

						
								String temp = stringTempMaker[ index ];
								stringTempMaker[index] = stringTempMaker[ assume_min_index  ];
								stringTempMaker[ assume_min_index  ] = temp;
						
							}
							System.out.println("After sorting by maker: ");
	                       	for(int i=0; i<stringTempMaker.length; i++) {
	                       		System.out.print("\t" + stringTempMaker[i]);
	                       		System.out.print("\t");
	                       	}
	                       	System.out.println();
	                       	for(int j=0; j<C.length; j++) {
	                       		
	                       		if(C[j].getMake().equals("Chevy")) {
	                       			System.out.print("\t" + stringTemp[j]);
	                       			
	                       		}
	                       	}
	                       	
	                       	for(int k=0; k<C.length; k++) {
	                       		
	                       		if(C[k].getMake().equals("Ford")) {
	                       			System.out.print("\t" + stringTemp[k]);
	                       			 
	                       		}
	                       	}
					    	break;	
					    case '2':
					    	//selection sort algorithm for double valued price array
					    	for( int index =0; index < doubleTempPrice.length -1; index++  )
							{
								// assume the Index of min value is equal to outer index
								int assume_min_index = index;

								// to find the index of the smallest value
								for( int smallest_index = index +1; smallest_index < doubleTempPrice.length; smallest_index++ )
									/*Read as: for values starting at 0 to 5 in increments of smallest+1*/
								{
									if ( Double.compare(doubleTempPrice[ smallest_index ], doubleTempPrice[assume_min_index]) < 0)
										assume_min_index = smallest_index;

								}

						
								double temp = doubleTempPrice[ index ];
								doubleTempPrice[index] = doubleTempPrice[ assume_min_index ];
								doubleTempPrice[ assume_min_index  ] = temp;
						
							}
							System.out.println("After sorting by price: ");
							for( double Name: doubleTempPrice) 
								System.out.print( Name + "\t"+ "\t");
							System.out.println();
							System.out.println("greyFiesta,   greenFiesta,     blackTahoe,      goldTahoe,      blueMalibu,     redMalibu,    whiteExplorer,     blueExplorer,  limeGreenMust,  purpleMust,   blackChall,      whiteChall");
					    	break;
					    default:
					    	System.out.println("Invalid input! ");
					}
				}while ( option.charAt(0)!= 'q' &&  option.charAt(0)!= 'Q');
				
					
				}
	

}
