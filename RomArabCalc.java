import java.util.Scanner;


public class RomArabCalc {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int res, n1 = 0, n2 = 1;
        char op = 0;
        Boolean n = false, r = false;
        String d = null;

        System.out.println("Введите выражение без пробелов (на ноль делить нельзя):");
        String uInput = sc.nextLine();
        if (uInput.length() < 3) {
            System.out.println("Выражение не было введено либо введено с пробелами");
            System.exit(0);
        } else if (uInput.length() < 7) {
            for (int i = 0; i < uInput.length(); i++) {
                switch (uInput.charAt(i)) {
                    case '1':
                        n = true;
                        break;
                    case '2':
                        n = true;
                        break;
                    case '3':
                        n = true;
                        break;
                    case '4':
                        n = true;
                        break;
                    case '5':
                        n = true;
                        break;
                    case '6':
                        n = true;
                        break;
                    case '7':
                        n = true;
                        break;
                    case '8':
                        n = true;
                        break;
                    case '9':
                        n = true;
                        break;
                    case '0':
                        n = true;
                        break;
                    case 'I':
                        r = true;
                        break;
                    case 'V':
                        r = true;
                        break;
                    case 'X':
                        r = true;
                        break;
                    case '+':
                        op = '+';
                        d = "\\+";
                        break;
                    case '-':
                        op = '-';
                        d = "-";
                        break;
                    case '*':
                        op = '*';
                        d = "\\*";
                        break;
                    case '/':
                        op = '/';
                        d = "/";
                        break;
                    default:
                        System.out.println("Выражение введено некорректно");
                        System.exit(0);
                }
            }
        } else {
            System.out.println("Выражение вне условий");
            System.exit(0);
        }
        String[] nb = uInput.split(d);

        String[] rm = {"O", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X",
                "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX",
                "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX",
                "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL",
                "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L",
                "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX",
                "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX",
                "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX",
                "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC",
                "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"
        };


        if (n==true && n!=r) {
            n1 = Integer.parseInt(nb[0]);
            n2 = Integer.parseInt(nb[1]);
            res = calc(n1, n2, op);
            if (res<101){
                System.out.println("Ответ: " + res);
            }else if (res>100) {
                System.out.println("Выражение вне условий");
                System.exit(0);
            }

        } if (r==true && n!=r){
            for (int i = 0; i<11; i++){
                if (nb[0].equals(rm[i])){
                    n1 = i;
                }
                if (nb[1].equals(rm[i])){
                    n2 = i;
                }
            }
            res = calc(n1, n2, op);
            if (res>0 && res<101){
                System.out.println("Ответ: " + rm[res]);
            } else if(res<1) {
                System.out.println("Недопустимый ответ для римских цифр");
                System.exit(0);
            } else if (res>100){
                System.out.println("Выражение вне условий");
                System.exit(0);
            }

        } if (n==r) {
            System.out.println("Выражение вне условий");
            System.exit(0);
        }
    }


    public static int calc (int n1, int n2, int op){
        int rs = 0;

        if (n1>0 && n1<11 && n2>0 && n2 <11){
            switch (op) {
                case '+':
                    rs = n1 + n2;
                    break;
                case '-':
                    rs = n1 - n2;
                    break;
                case '*':
                    rs = n1 * n2;
                    break;
                case '/':
                    rs = n1 / n2;
                    break;
            }
        }else {
            rs=123;
        }
        return rs;
    }
}