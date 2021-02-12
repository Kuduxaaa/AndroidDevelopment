package JAVAExercises;

import java.util.*;

public class One 
{
	public static void main(String[] args)
	{
		// თარიღის შემოტანა
		Date date = new Date();
		int currentYear = (1900 + date.getYear());

		// ჩემი აღწერილობა ცვლადებით
		int birthYear = 2005; 
		String myFirstName = "Nika";
		String myLastName = "Kudukhashvili";
		int myAge = (currentYear - birthYear);
		String adult = checkAdult(myAge);

		// განსაზღვრული სიგრძის String ტიპის Array
		String[] integersList = new String[1];
		integersList[0] = "ეს არის ჩემი ტექსტი განსაზღვრული სიგრძის Array -ში";

		// Array -ის ტიპი რომლის ელემენტებიც უცვლელია
		int[] iterations = {1, 2, 3, 4};

		// List მეთოდი
		List<Integer> safeList = new ArrayList<Integer>();
		List unsafetList = new ArrayList();

		safeList.add(1);
		safeList.add(3);
		safeList.add(5);
		safeList.add(7);

		// რიგითობის ელემენტების ამოღება for ციკლის გამოყენებით
		for (int i=0; i < iterations.length; i++)
		{
			/* 
			 * Array -დან ამოღებული ელემენტების 
			 * სტრინგად ქცევა და მისი Variable -ში შენახვა 
			 */
			String eachValue = numberConverter(iterations[i]);
			System.out.println(eachValue);
		}

		System.out.println("\nგამარჯობა, ჩემი სახელია " + myFirstName + myLastName);
		System.out.println("მე ვარ " + myAge + " წლის (" + adult + ")");
		System.out.println("ორი წლის შემდეგ ვიქნები " + (myAge + 2) + " წლის!");

		// საშინაო დავალება, ლექცია: 20
		String[] city = {"თბილისი", "ლონდონი", "პარიზი"};
		System.out.println("\nჩემი ფავორიტი ქალაქი არის " + city[0]);


		// Hashmaps (Dicts) ლექცია: 21
		Map capitalsHashMap = new HashMap();

		capitalsHashMap.put("Georgian", "თბილისი");
		capitalsHashMap.put("English", "ლონდონი");
		capitalsHashMap.put("France", "პარიზი");

		System.out.println(capitalsHashMap.get("Georgian") + " არის საქართველოს დედაქალაქი");
	}

	public static String numberConverter(int number)
	{
		/*
		 * ფუნნქცია გარდაქმნის int ჩანაწერს
		 * String ტიპის ჩანაწერად (1 -დან 4 -მდე)
		 * სავარჯიშო Switch -ზე
		*/
		String toReturn;
		switch (number)
		{
			case 1:
				toReturn = "ერთი";
				break;
			case 2:
				toReturn = "ორი";
				break;
			case 3:
				toReturn = "სამი";
				break;
			case 4:
				toReturn = "ოთხი";
				break;
			default:
				toReturn = "ოთხის ზემოთ თვლა არ ვიცი ;დ";
				break;
		}
		return toReturn;
	}

	public static String checkAdult(int age)
	{

		/* ფუნქცია ამოწებს ასაკს 
		 * თუ ასაკი მეტია ვიდრე 18
		 * გვიბრუნებს "სრულწლოვანი"
		 * წინააღმდეგ შემთხვევაში "არასრულოვანი"
		 * ამის გაკეთება შეიძლებოდა ერთი ხაზითაც ასე:
		 * ((myAge > 18) ? "სრულწლოვანი" : "არასრულწლოვანი")
		 * სავარჯიშო if statement -ზე
		*/

		if (age > 18)
		{
			return "სრულწლოვანი";
		} else {
			return "არასრულწლოვანი";
		}
	}
}
