import com.bridgelabz.MoodAnalyzer.PersonMoodAnalyzer;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        PersonMoodAnalyzer p = new PersonMoodAnalyzer(null); //Giving this null  message to get the output "Invalid"
        System.out.println("Mood of the person is : "+p.analyzeMood());



        }
    }
