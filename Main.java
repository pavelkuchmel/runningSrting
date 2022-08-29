import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        ArrayList<Character> moveString = new ArrayList<>();
        String test = "Вика кашка :*";
        int i = 0;
        for (;;i++){
            try {
                moveString.add(test.charAt(i));
            }catch (StringIndexOutOfBoundsException e) {
                break;
            }
        }
        for (int j = 0;j<i;j++){
            System.out.print(moveString.get(j));
            try {TimeUnit.MILLISECONDS.sleep(500);}catch (InterruptedException e){}
        }
        try {TimeUnit.MILLISECONDS.sleep(5000);}catch (InterruptedException e){}
    }
}