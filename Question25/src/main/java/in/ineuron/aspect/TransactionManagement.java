package in.ineuron.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class TransactionManagement {

//	@Pointcut("execution(public void in.ineuron.dao.EmployeeDao.saveEmployee())")
//	public void p1() {};
	
	@Pointcut("execution(public * in.ineuron.dao.*.saveEmployee())")
	public void p1() {};
	
	@Before("p1()")
	public void beginTransaction() {
		System.out.println("Transaction started");
	}
	
	@After("p1()")
	public void commitTransaction() {
		System.out.println("Transaction commited");
	}
	
}
