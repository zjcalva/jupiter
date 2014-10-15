package sklse.jupiter.logging;


public final class LogFactory {


  public static Log getLog(Class<?> aClass) {
	  Log log = new JdkLoggerImpl(aClass.getName());
	  return log;
  }

  

}
