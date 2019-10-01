package Datatypes;
import java.util.*;
public class SearchCar {
	public static void main(String[] args) {

		Car car1=new Car("A1","BMW","23");
		Car car4=new Car("A2","Santro","231");
		Car car3=new Car("A3","Alto","232");
		Car car2=new Car("A4","Mercedes","233");

		ShowRoom library=new ShowRoom();
		library.setShowName("SHOWROOM");

		HashMap<String, Car> carss=new HashMap<>();

		carss.put(car1.getcarNumber(),car1);
		carss.put(car2.getcarNumber(),car4);
		carss.put(car4.getcarNumber(),car2);
		carss.put(car3.getcarNumber(),car3);


		library.setcars(carss);

		HashMap<String, Car> libBooks=(HashMap<String, Car>)library.getcars();
		System.out.println(libBooks.get("23"));

		//---------------------------------------

		Car car5=new Car("A5","Zen","230");
		Car car6=new Car("A6","i20","235");
		Car car7=new Car("A7","i10","234");
		Car car8=new Car("A8","Maruti","236");


		ShowRoom library2=new ShowRoom();
		library2.setShowName("SHOWROOM1");
		
		HashMap<String, Car> books1=new HashMap<>();
		
		books1.put(car8.getcarNumber(),car8);
		books1.put(car5.getcarNumber(),car5);
		books1.put(car7.getcarNumber(),car7);
		books1.put(car6.getcarNumber(),car6);
		
		library2.setcars(books1);


		//ShowRoom library2=new ShowRoom();
		//library2.setShowName("SHOWROOM");


		HashMap<String, Map<String,Car>>
		showCollections=new HashMap<>();

		showCollections.put(library.getShowName(), library.getcars());
		showCollections.put(library2.getShowName(), library2.getcars());


		Map<String,Car> stateLibraryBooks=showCollections.get("SHOWROOM");
		Map<String,Car> stateLibraryBooks1=showCollections.get("SHOWROOM1");

		Set<String> carnames=stateLibraryBooks.keySet();
		Set<String> carnames1=stateLibraryBooks1.keySet();

		System.out.println("CARS IN "+library2.getShowName());

		for(String isbn:carnames){
		System.out.println(stateLibraryBooks.get(isbn));
		}

		System.out.println("CARS IN "+library.getShowName());

		for(String isbn:carnames1){
		System.out.println(stateLibraryBooks1.get(isbn));
		}


		}

}
