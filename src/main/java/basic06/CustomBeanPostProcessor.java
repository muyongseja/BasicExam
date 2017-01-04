package basic06;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class CustomBeanPostProcessor implements BeanPostProcessor{

	@Override
	public Object postProcessAfterInitialization(
			Object arg0, String arg1) throws BeansException {
		System.out.println("8. 초기화 후 빈에 대한 처리 : " + arg0 + ", " + arg1);
		return arg0;
	}

	@Override
	public Object postProcessBeforeInitialization(Object arg0, String arg1) throws BeansException {
		System.out.println("5. 초기화 전 빈에 대한 처리 : " + arg0 + ", " + arg1);
		return arg0;
	}

}
