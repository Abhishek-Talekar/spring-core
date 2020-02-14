package com.mr.beans;

import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;

public class GetPremiumAmountReplacer implements MethodReplacer {

	@Override
	public Object reimplement(Object target, Method method, Object[] args) throws Throwable {

		if (method.getName().equals("getPremiumAmount")) {
			String policyName = (String) args[0];
			long insuredAmount = (long) args[1];
			int age = (int) args[2];
			String gender = (String) args[2];
			int tenure = (int) args[2];
			System.out.println("Policy name is: "+policyName+"Insured Amount is: Rs."+insuredAmount+"Age is: "+age);
			double amt = insuredAmount * tenure / 20;

			return amt;
		}
		return null;
	}

}
