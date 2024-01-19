

public class GoogleBillboard {
	public final static String e = "2.7182818284590452353602874713526624977572470936999595749669676277240766303535475945713821785251664274274663919320030599218174135966290435";  
	public static void main(final String[] args) {
		System.out.println("Replace this string with your answer!");
	}
	

	//Finish this function
	//This function needs to be static because you will eventually call it in main() which is also a static function
	public static boolean isPrime(double d){
		if (d % 2 == 0 || d % 3 == 0 || n % d == 0 || d % 7 == 0 || d % 11 == 0 || d % 13 == 0) return false;
        double i = 3;
        while (i * i <= d) {
            if (d % i == 0) return false;
            i += 2;
        }
        return true;
	}
