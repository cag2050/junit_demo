import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class RunTestMessageUtil {
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(TestMessageUtil.class);
        for (Failure failure : result.getFailures()) {
            System.out.println("failure info ===");
            System.out.println(failure.toString());
        }
        System.out.println("success info ===");
        System.out.println(result.wasSuccessful());
    }
}
