package javfx;
import java.util.Scanner;

import javax.sound.midi.Soundbank;

import javafx.collections.ObservableList;

public class Converter extends App {
public static void main(String[] args) {
}
public String Conv(String val){
//Scanner sc = new Scanner(System.in);

System.out.println("Please input your query. For example, 1 km to m.");
System.out.println("Enter 'exit' or '-1' to exit the program");

while (true) {
String input = val;

if (input.equals("exit") || input.equals("-1")) {
break;
}

String parts = input;//.split(" ");
if (parts.length() == 0) {
System.out.println("Your input is not currently handled by this app, please input another query, for example, 1 kg to lb");
continue;
}

double value = Double.parseDouble(parts);
String from = parts;
String to = parts;

String result = "";
switch (from + "-" + to) {
case "km->m":
result = value * 1000+ "";
break;
case "m->km":
result = value / 1000+ "";
break;
case "kg->lb":
result = value * 2.20462+ "";
break;
case "lb->kg":
result = value / 2.20462+ "";
break;
case "ft->m":
result = value * .3048+ "";
break;
case "m->ft":
result = value / .3048+ "";
break;
case "mi->km":
result = value * 1.609344+ "";
break;
case "km->mi":
result = value / 1.609344+ "";
break;
case "mph->kph":
result = value * 1.609344+ "";
break;
case "kph->mph":
result = value / 1.609344+ "";
break;
default:
System.out.println("Your input is not currently handled by this app, please input another query, for example, 1 kg to lb");
continue;

}
return result;

//System.out.println(String.format("%.2f %s = %.2f %s", value, from, result, to));

//sc.close();
}
return "";
}

}




