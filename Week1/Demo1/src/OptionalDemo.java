import java.util.Optional;

public class OptionalDemo {

	public static void main(String[] args) {
		String[] str = new String[10];
		str[4] = "WELCOME TO JAVA";
		Optional<String> checkNull = Optional.ofNullable(str[4]);
		System.out.println(" Is value present :"+checkNull.isPresent() );
		checkNull.ifPresent(System.out::println);   // printing value by using method reference   
		if (checkNull.isEmpty()) {
			System.out.println("String value not present");
		} else {
			String lowerCase = str[4].toLowerCase();
			System.out.println("Lower case :" + lowerCase);
			System.out.println(" Get Optinal value :"+checkNull.get() );
			System.out.println("Hsash code of optional value :"+checkNull.hashCode());
		}

		String lastName = null;
		String name=Optional.ofNullable(lastName).orElse("Sindhu");
		System.out.println("Name is :"+name);
		
		// It returns an empty instance of Optional class   
        Optional<String> empty = Optional.empty();  
        System.out.println(empty);  
		
	}

}
