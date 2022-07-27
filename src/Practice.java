import java.time.DateTimeException;

public class Practice {

    public static void main(String[] args) {
        try {

            Util.getFormattedDate("dd/mm/yyyy");
        } catch (DateTimeException timeException) {
            timeException.printStackTrace();

        } catch (ArithmeticException arithmeticException) {

        } catch (ArrayIndexOutOfBoundsException outOfBoundsException) {

        } catch (Exception exception) {

        } finally {

        }
    }


}
