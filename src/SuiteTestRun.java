import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

//使用组合测试，同时测试App.class、MessageUtilTest.class
@RunWith(value = org.junit.runners.Suite.class)
@SuiteClasses(value = {App.class, MessageUtilTest.class})

public class SuiteTestRun {
}
