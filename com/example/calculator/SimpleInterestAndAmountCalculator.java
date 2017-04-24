package com.example.calculator;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.*;

@SuppressWarnings("serial")
public class SimpleInterestAndAmountCalculator extends HttpServlet {

	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
		PrintWriter writer = response.getWriter();

		double principal = Double.parseDouble(request.getParameter("principal"));
		double rateOfInterest = Double.parseDouble(request.getParameter("rateOfInterest"));
		int timePeriod = Integer.parseInt(request.getParameter("timePeriod"));

		double simpleInterest = (principal * rateOfInterest * timePeriod) / 100;
		double amount = principal + simpleInterest;

		
		writer.println("The Simple Interest is Rs." + simpleInterest + " and the Amount is Rs." + amount);
	}
}
