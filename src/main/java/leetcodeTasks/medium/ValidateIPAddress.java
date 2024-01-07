package leetcodeTasks.medium;

import java.util.Set;

//https://leetcode.com/problems/validate-ip-address/description/
public class ValidateIPAddress {
    public static void main(String[] args) {
        validIPAddress("001.0.0.1");
        validIPAddress("172.16.254.1");
        validIPAddress("2001:0db8:85a3:0:0:8A2E:0370:7334");
        validIPAddress("256.256.256.256");
        validIPAddress("1e1.2.3.4");
        validIPAddress("1.0.1.");
        validIPAddress("2:2:2:2:2:2:2:");
    }

    public static String validateIPv4(String IP) {
        String[] nums = IP.split("\\.", -1);
        for (String x : nums) {
            // Проверка диапазона чисел (0, 255):
            // 1. длинна в промежутке 1 и 3
            if (x.length() == 0 || x.length() > 3) return "Neither";
            // 2. без ведущих нулей
            if (x.charAt(0) == '0' && x.length() != 1) return "Neither";
            // 3. только цифры
            for (char ch : x.toCharArray()) {
                if (!Character.isDigit(ch)) return "Neither";
            }
            // 4. значения больше 255 не допускаются
            if (Integer.parseInt(x) > 255) return "Neither";
        }
        return "IPv4";
    }

    public static String validateIPv6(String IP) {
        String[] nums = IP.split(":", -1);
        Set<Character> hexSet = Set.of('a','b','c','d','e','f','0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F');
        for (String x : nums) {
            // Проверка hex
            // 1. количество символов от 0 до 4
            if (x.length() == 0 || x.length() > 4) return "Neither";
            // 2. проверяем что символы соответствуют hex маске: 0-9, a-f, A-F
            for (Character ch : x.toCharArray()) {
                if (!hexSet.contains(ch)) return "Neither";
            }
        }
        return "IPv6";
    }

    public static String validIPAddress(String IP) {
        if (IP.chars().filter(ch -> ch == '.').count() == 3) {
            return validateIPv4(IP);
        } else if (IP.chars().filter(ch -> ch == ':').count() == 7) {
            return validateIPv6(IP);
        } else return "Neither";
    }

}
