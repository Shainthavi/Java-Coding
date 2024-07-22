import java.util.Scanner;

public class IPAddressClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an IP address (e.g., 192.168.1.1):");
        String ipAddress = scanner.nextLine();
        scanner.close();

        String ipClass = findIPClass(ipAddress);
        if (ipClass != null) {
            System.out.println("The IP address " + ipAddress + " belongs to Class " + ipClass);
        } else {
            System.out.println("Invalid IP address.");
        }
    }

    private static String findIPClass(String ipAddress) {
        try {
            String[] parts = ipAddress.split("\\.");
            if (parts.length != 4) {
                return null; 
            }

            int firstOctet = Integer.parseInt(parts[0]);

            if (firstOctet >= 1 && firstOctet <= 126) {
                return "A";
            } else if (firstOctet >= 128 && firstOctet <= 191) {
                return "B";
            } else if (firstOctet >= 192 && firstOctet <= 223) {
                return "C";
            } else if (firstOctet >= 224 && firstOctet <= 239) {
                return "D";
            } else if (firstOctet >= 240 && firstOctet <= 255) {
                return "E";
            } else {
                return null; 
            }
        } catch (NumberFormatException e) {
            return null; 
        }
    }
}
