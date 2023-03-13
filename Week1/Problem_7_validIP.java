
public class Problem_7_validIP {
    public static void main(String[] args) {
        String ipAddress1 = "192.168.0.1";
        String ipAddress2 = "10.0.0.256";
        String ipAddress3 = "172.16.0.0.1";
        String ipAddress4 = "192.168.0.01";

        System.out.println(ipAddress1 + " is a valid IPv4 address: " + isValidIPv4(ipAddress1));
        System.out.println(ipAddress2 + " is a valid IPv4 address: " + isValidIPv4(ipAddress2));
        System.out.println(ipAddress3 + " is a valid IPv4 address: " + isValidIPv4(ipAddress3));
        System.out.println(ipAddress4 + " is a valid IPv4 address: " + isValidIPv4(ipAddress4));
    }



    public static boolean isValidIPv4(String ipAddress) {
        String[] parts = ipAddress.split("\\.");

        if (parts.length != 4) {
            return false;
        }

        for (String part : parts) {
            try {
                int num = Integer.parseInt(part);
                if (num < 0 || num > 255) {
                    return false;
                }
                if (part.charAt(0) == '0' && part.length() > 1) {
                    return false;
                }
            } catch (NumberFormatException e) {
                return false;
            }
        }

        return true;
    }
//  This function takes in a string ipAddress and splits it into four parts using the split() method with a regular expression \\.. If the resulting array does not have exactly four elements, the function returns false.

// The function then iterates through each part of the IP address and checks if it is a valid integer between 0 and 255. If the part is not a valid integer or is outside the range of 0 to 255, the function returns false. Additionally, the function checks if the part starts with a zero and has more than one character, which would make it an invalid integer with leading zeros.

// If all parts of the IP address are valid, the function returns true.

// Note: This function assumes that the input string contains only the IP address and does not have any additional characters or white space.

}